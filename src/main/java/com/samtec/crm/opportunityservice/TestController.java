package com.samtec.crm.opportunityservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/api/test"})
public class TestController {

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.url}")
    private String url;

    public String username(){
        return String.format("Datasource usenname %s",username);
    }

    public String url(){
        return String.format("Datasource url %s",url);
    }
}
