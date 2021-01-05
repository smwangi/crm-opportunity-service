package com.samtec.crm.opportunityservice.source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = {"/sources"},produces = MediaType.APPLICATION_JSON_VALUE)
public class SourceController {

    @Autowired
    private SourceService sourceService;

    @GetMapping("/")
    public List<SourceDto> fetchAll(){
        return sourceService.fetchAll();
    }
}
