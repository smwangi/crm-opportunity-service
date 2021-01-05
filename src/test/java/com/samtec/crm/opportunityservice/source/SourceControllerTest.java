package com.samtec.crm.opportunityservice.source;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@ExtendWith(SpringExtension.class)
@WebMvcTest
@TestPropertySource(locations = {"file:///home/wanjohi/config-repo/application-test.properties"})
public class SourceControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private SourceService sourceService;

    @Test
    @DisplayName("Fetch All Sources.")
    void fetchAllSources() throws Exception{
        List<SourceDto> sourcesList = new ArrayList<>();
        sourcesList.add(new SourceDto(1L,"Referral","Test 1"));
        sourcesList.add(new SourceDto(2L,"Sources 2","Test 2"));
        when(sourceService.fetchAll()).thenReturn(sourcesList);

        mockMvc.perform(MockMvcRequestBuilders.get("/sources/")
        .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(jsonPath("$",hasSize(2))).andDo(print());
    }
}
