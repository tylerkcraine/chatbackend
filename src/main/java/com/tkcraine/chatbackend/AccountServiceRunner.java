package com.tkcraine.chatbackend;

import java.util.Arrays;
import java.util.Set;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tkcraine.chatbackend.Entity.*;
import com.tkcraine.chatbackend.Repository.*;
import com.tkcraine.chatbackend.Service.AccountService;

@Component
public class AccountServiceRunner implements CommandLineRunner{
    @Autowired
    private AccountRepository ar;

    @Autowired
    private RoomRepository rr;

    @Autowired
    private RoomParticipantRepository cc;

    @Autowired
    private AccountService as;

    @Override
    public void run(String... strings) throws Exception {
        ar.deleteAll();

        Account ac1 = new Account("tkcraine", "tkcraine@gmail.com");
        Account ac2 = new Account("rbronstien", "rbron@gmail.com");
        Account ac3 = new Account("cyzu", "azureBlue@gmail.com");

        ar.saveAllAndFlush(Arrays.asList(ac1, ac2, ac3));

        rr.deleteAll();

        Room rc1 = new Room("Chuckle Hut");
        Room rc2 = new Room("Bad Ping");
        Room rc3 = new Room("Talon Diff???");

        rr.saveAllAndFlush(Arrays.asList(rc1,rc2,rc3));

        RoomParticipant rp1 = new RoomParticipant(ac1, rc1);
        RoomParticipant rp2 = new RoomParticipant(ac2, rc1);
        RoomParticipant rp3 = new RoomParticipant(ac3, rc1);

        cc.saveAllAndFlush(Arrays.asList(rp1,rp2,rp3));

        Set<RoomParticipant> thing = cc.findAllByRoomName(rc1.getName());
        for (RoomParticipant i : thing) {
            System.out.println(i.getAccount().getName());
        }
    } 
}
