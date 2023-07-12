package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mailService")
@Scope("singleton")     // singleton, prototype
public class MailService implements MessageService{

    //Repository repository = new FileRepository();
    // Field Injection
    /*
    @Autowired
    @Qualifier("fileRepository")
    private Repository repository;
     */

    // Setter Injection
    /*
    @Autowired
    @Qualifier("fileRepository")
    private Repository repository;
    public void setRepository(Repository repository){
        this.repository = repository;
    }
    */

    // Constructor Injection
    private Repository repository;
    @Autowired        // If you only have ONE constructor in a class, you do not need to write @Autowired
    public MailService(@Qualifier("fileRepository") Repository repository){
        this.repository = repository;
    }

    @Value("${app.email}")
    private String email;


    public void sendMessage(Message message){
        System.out.println("This is the mail service. You got a message: "+message.getMessage());
    }



}
