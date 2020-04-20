package com.abhay.sfgdi1.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreeterService implements GreeterService{
    @Override
    public String greeting() {
        return "Hello World - EN";
    }
}
