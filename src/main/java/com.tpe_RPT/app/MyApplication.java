package com.tpe_RPT.app;

import com.tpe_RPT.AppConfiguration_RPT;
import com.tpe_RPT.domain.Message;
import com.tpe_RPT.service.MailService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
    public static void main (String[] args) {

        Message message = new Message();
        message.setMessage("Yor package arrived");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration_RPT.class);

        MailService mailService = context.getBean(MailService.class);
        mailService.sendMessage(message);
        context.close();

    }
}
