package com.tpe.app;

import com.tpe.AppConfiguration;
import com.tpe.domain.Message;
import com.tpe.service.MailService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
    public static void main (String[] args) {
        Message message = new Message();
        message.setMessage("Your package is arrived.");

        AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(AppConfiguration.class);


        MailService mailService = contex.getBean(MailService.class);
        mailService.sendMessage(message);

        contex.close();


    }


}
