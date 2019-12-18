
$(function() {
    "use strict";
    var CostRecord;
    var MonthlyCost=new Array(15);
    MonthlyCost.fill(0);
    var MonthlyIncome=new Array(15);
    MonthlyIncome.fill(0);
    var RecentMonth=0;
    var Month=['','一月','二月','三月','四月','五月','六月','七月','八月','九月','十月','十一月','十二月'];

    $.ajax({
        cache: false,
        async: false,
        type: 'GET',
        url: 'http://localhost:8080/record/queryAll',
        dataType: 'json',
        success: function(data) {
            CostRecord=data;
            $.each(data, function (index) {
                //循环获取数据
                var Month = data[index].date[5]+data[index].date[6];
                // var Category = data[index].category;
                // var Type = data[index].type;
                var Cost = data[index].cost;
                // CostRecord +='{'+'"Month":' + Month + ', "Category":"' + Category +'", "Type":"'+ Type +  '", "Cost":' + Cost + '},';
                MonthlyCost[Month]+=Number(Cost);
                RecentMonth=Math.max(Month,RecentMonth);
            });
            if(RecentMonth<7) RecentMonth=7;

        },
        error: function(xhr, type) {
        }
    });
    var MaxSum=0;
    for(i=0;i<6;i++){
        MaxSum=Math.max(MaxSum,MonthlyCost[RecentMonth-i]);
        MaxSum=Math.max(MaxSum,MonthlyIncome[RecentMonth-i]);
    }
    // ==============================================================
    // Sales overview
    // ============================================================== 
    var chart2 = new Chartist.Bar('.amp-pxl', {

        labels: [Month[RecentMonth-6], Month[RecentMonth-5], Month[RecentMonth-4], Month[RecentMonth-3], Month[RecentMonth-2], Month[RecentMonth-1], Month[RecentMonth]],
        series: [
            [MonthlyCost[RecentMonth-6], MonthlyCost[RecentMonth-5], MonthlyCost[RecentMonth-4], MonthlyCost[RecentMonth-3], MonthlyCost[RecentMonth-2], MonthlyCost[RecentMonth-1], MonthlyCost[RecentMonth]],

            [MonthlyIncome[RecentMonth-6], MonthlyIncome[RecentMonth-5], MonthlyIncome[RecentMonth-4], MonthlyIncome[RecentMonth-3], MonthlyIncome[RecentMonth-2], MonthlyIncome[RecentMonth-1], MonthlyIncome[RecentMonth]],

        ]
    }, {
        axisX: {
            // On the x-axis start means top and end means bottom
            position: 'end',
            showGrid: false
        },
        axisY: {
            // On the y-axis start means left and end means right
            position: 'start'
        },
        high: MaxSum+50,
        low: '0',
        plugins: [
            Chartist.plugins.tooltip()
        ]
    });

    var chart = [chart2];

    // ============================================================== 
    // This is for the animation
    // ==============================================================

    for (var i = 0; i < chart.length; i++) {
        chart[i].on('draw', function(data) {
            if (data.type === 'line' || data.type === 'area') {
                data.element.animate({
                    d: {
                        begin: 500 * data.index,
                        dur: 500,
                        from: data.path.clone().scale(1, 0).translate(0, data.chartRect.height()).stringify(),
                        to: data.path.clone().stringify(),
                        easing: Chartist.Svg.Easing.easeInOutElastic
                    }
                });
            }
            if (data.type === 'bar') {
                data.element.animate({
                    y2: {
                        dur: 500,
                        from: data.y1,
                        to: data.y2,
                        easing: Chartist.Svg.Easing.easeInOutElastic
                    },
                    opacity: {
                        dur: 500,
                        from: 0,
                        to: 1,
                        easing: Chartist.Svg.Easing.easeInOutElastic
                    }
                });
            }
        });
    }

    // ============================================================== 
    // My Cost
    // ==============================================================
    var Data;
    $.ajax({
        cache: false,
        async: false,
        type: 'GET',
        url: 'http://localhost:8080/record/executeQuery?sql=select%20category,sum(cost)%20from%20record%20order%20by%20category%20group%20by%20category',
        dataType: 'json',
        success: function(data) {
            Data=data;
        },
        error: function(xhr, type) {
        }
    })
    console.log(Data);
    var Legend=[];
    var Categories=[];
    for(i=0;i<Data.length;i++){
        var category=Data[i][0];
        var cost=Data[i][1];
        var tmp={};
        tmp['value']=cost;
        tmp['name']=category;
        Categories.push(tmp);
        Legend.push(category);
    }
    console.log(Categories);
    Categories=JSON.parse(Categories);
    console.log(Categories);
    $.ajax({
        cache: false,
        async: false,
        type: 'GET',
        url: 'http://localhost:8080/record/executeQuery?sql=select%20type,sum(cost)%20from%20record%20order%20by%20category%20group%20by%20type',
        dataType: 'json',
        success: function(data) {
            Data=data;
        },
        error: function(xhr, type) {
        }
    })
    var Types=[];
    for(i=0;i<Data.length;i++){
        var type=Data[i][0];
        var cost=Data[i][1];
        var tmp={};
        tmp['value']=cost;
        tmp['name']=type;
        Types.push(tmp);
        Legend.push(type);
    }
    Types=JSON.parse(Types);
    console.log(Types);
    var myChart = echarts.init(document.getElementById('cost'));
    var option = {
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b}: {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            x: 'left',
            data:Legend
        },
        series: [
            {
                name:'账户',
                type:'pie',
                selectedMode: 'single',
                radius: [0, '30%'],

                label: {
                    normal: {
                        position: 'inner'
                    }
                },
                labelLine: {
                    normal: {
                        show: false
                    }
                },
                data:Categories
                //     [
                //     {value:335, name:'直达', selected:true},
                //     {value:679, name:'营销广告'},
                //     {value:1548, name:'搜索引擎'}
                // ]
            },
            {
                name:'类别',
                type:'pie',
                radius: ['40%', '55%'],
                label: {
                    normal: {
                        formatter: '{a|{a}}{abg|}\n{hr|}\n  {b|{b}：}{c}  {per|{d}%}  ',
                        backgroundColor: '#eee',
                        borderColor: '#aaa',
                        borderWidth: 1,
                        borderRadius: 4,
                        rich: {
                            a: {
                                color: '#999',
                                lineHeight: 22,
                                align: 'center'
                            },
                            hr: {
                                borderColor: '#aaa',
                                width: '100%',
                                borderWidth: 0.5,
                                height: 0
                            },
                            b: {
                                fontSize: 16,
                                lineHeight: 33
                            },
                            per: {
                                color: '#eee',
                                backgroundColor: '#334455',
                                padding: [2, 4],
                                borderRadius: 2
                            }
                        }
                    }
                },
                data:Types
            }
        ]
    };
    myChart.setOption(option);

});
