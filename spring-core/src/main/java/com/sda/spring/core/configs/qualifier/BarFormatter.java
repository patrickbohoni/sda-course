package com.sda.spring.core.configs.qualifier;

import org.springframework.stereotype.Component;

@Component
public class BarFormatter implements Formatter {

    public String format(String somestring) {
        return "";
    }
}
