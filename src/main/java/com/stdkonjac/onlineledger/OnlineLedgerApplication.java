package com.stdkonjac.onlineledger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.stdkonjac.onlineledger.dao")
public class OnlineLedgerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineLedgerApplication.class, args);
    }

}
