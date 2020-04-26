package com.abhay.sfgdi1.config;


import com.abhay.sfgdi1.service.JokeService;
import com.abhay.sfgdi1.service.JokeServiceImpl;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiConfig {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
//
//    @Bean
//    public JokeService jokeService() {
//        return new JokeServiceImpl(chuckNorrisQuotes());
//    }

}
