package com.tpe.repository;

import com.tpe.domain.Message;
import org.springframework.stereotype.Component;

@Component("fileRepository")
public class FileRepository implements Repository{


    @Override
    public void save(Message message) {
        System.out.println("Your message is being saved to the local file.");
    }
}
