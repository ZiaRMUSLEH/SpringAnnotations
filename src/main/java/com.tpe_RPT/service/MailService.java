package com.tpe_RPT.service;


import com.tpe_RPT.domain.Message;
import org.springframework.stereotype.Component;

@Component
public class MailService {

    public void sendMessage (Message message){
        System.out.println("This is the mail service. You got a message: "+message.getMessage());
    }



}
