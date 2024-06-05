package com.tkcraine.chatbackend;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tkcraine.chatbackend.entity.*;
import com.tkcraine.chatbackend.repository.*;

import jakarta.transaction.Transactional;

@Component
public class AccountServiceRunner implements CommandLineRunner{
    @Autowired
    private AccountRepository ar;

    @Autowired
    private RoomRepository rr;

    @Autowired
    private RoomParticipantRepository rpr;

    @Autowired
    private MessageRepository mr;


    @Override
    @Transactional
    public void run(String... strings) throws Exception {
        
        // Account account1 = new Account("tkcraine", "tkcraine@gmail.com");
        // Account account2 = new Account("rbronstien", "rbronstien@gmail.com");
        // Account account3 = new Account("cclay", "azureDragon@gmail.com");

        // for (Account a : Arrays.asList(account1, account2, account3)) {
        //     if (ar.findByEmail(a.getEmail()) == null) {
        //         ar.saveAndFlush(a);
        //     } else {
        //         a = ar.findByEmail(a.getEmail());
        //     }
        // }

        // Room
    } 
}
