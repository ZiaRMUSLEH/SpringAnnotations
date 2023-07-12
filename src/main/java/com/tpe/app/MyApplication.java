package com.tpe.app;

import com.tpe.AppConfiguration;
import com.tpe.domain.Message;
import com.tpe.service.MessageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
    public static void main(String[] args) {

        Message message = new Message();
        message.setMessage("Your package has arrived.");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        //MailService mailServicee = new MailService();
        /*
        MailService mailService = context.getBean(MailService.class);
        MailService mailService1 = context.getBean(MailService.class);

        mailService.sendMessage(message);

        if (mailService == mailService1){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
        */

        //SMSService smsService = context.getBean(SMSService.class);
        //MessageService smsService = context.getBean(MessageService.class);    //new SMSService();
        MessageService messageService = context.getBean("smsService", MessageService.class);    //new SMSService();
        messageService.sendMessage(message);


        context.close();        // Destroy the beans that we created


    }
}




