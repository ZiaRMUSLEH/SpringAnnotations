package com.tpe.service;

import com.tpe.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component("smsService")
public class SMSService implements MessageService{

    @Autowired
    private Properties properties;


    @Override
    public void sendMessage(Message message) {
        System.out.println("This is the SMS Service. You have a new message: "+message.getMessage()+" || "+properties.get("email"));
    }
}
