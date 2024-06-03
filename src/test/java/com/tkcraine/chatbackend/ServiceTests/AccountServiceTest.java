package com.tkcraine.chatbackend.ServiceTests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.jdbc.Sql;
import com.tkcraine.chatbackend.Service.AccountService;
import com.tkcraine.chatbackend.Entity.Account;
import com.tkcraine.chatbackend.ChatbackendApplication;
import org.springframework.boot.SpringApplication;

@Sql({"/debug_schema.sql", "/debug_data"})
public class AccountServiceTest {
    ApplicationContext app;

    @BeforeEach
    public void setup() throws InterruptedException {
        String[] args = new String[] {};
        app = SpringApplication.run(ChatbackendApplication.class, args);
        Thread.sleep(500);
    }

    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(500);
        SpringApplication.exit(app);
    }

    @Test
    public void readAccountByName() {
        AccountService accountService = app.getBean(AccountService.class);
        Long account = accountService.getAccountByName("tkcraine");
        System.out.println(account);
    }
}
