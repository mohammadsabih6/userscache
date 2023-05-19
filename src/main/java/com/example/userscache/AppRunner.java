package com.example.userscache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class); 
    
    private final Iuser iuser;
    
    public AppRunner(Iuser iuser){
        this.iuser = iuser;
    }

    
    @Override
    public void run(String... args) throws Exception {
        logger.info("....Fetching user details.");.
        logger.info("Afnan---->  "+iuser.getByname("Master Trainer"));
        logger.info("Javeria---->  " + iuser.getByname(" Student"));
        logger.info("Tahreem---->  " + iuser.getByname("Student "));
        
    }


    
}
