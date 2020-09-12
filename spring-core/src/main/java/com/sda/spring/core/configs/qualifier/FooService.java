package com.sda.spring.core.configs.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FooService {

    //delegate to formatter
    @Autowired //don't do dis tho - no put autowired on field
    @Qualifier("barFormatter")
    private Formatter formatter;

    public void run() {
        formatter.format("hello");

    }


}
