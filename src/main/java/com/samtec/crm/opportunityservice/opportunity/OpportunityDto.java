package com.samtec.crm.opportunityservice.opportunity;

import com.samtec.crm.opportunityservice.source.SourceDto;

public class OpportunityDto {
    private Long opportunityId;

    private SourceDto sourceDto;

    public Long getOpportunityId() {
        return opportunityId;
    }

    public void setOpportunityId(Long opportunityId) {
        this.opportunityId = opportunityId;
    }

    public SourceDto getSourceDto() {
        return sourceDto;
    }

    public void setSourceDto(SourceDto sourceDto) {
        this.sourceDto = sourceDto;
    }
}
