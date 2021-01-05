package com.samtec.crm.opportunityservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableDiscoveryClient
@RequestMapping(path = {"/api/v1/crm-opportunity-service"})
public class CrmOpportunityApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmOpportunityApplication.class,args);
    }
}
