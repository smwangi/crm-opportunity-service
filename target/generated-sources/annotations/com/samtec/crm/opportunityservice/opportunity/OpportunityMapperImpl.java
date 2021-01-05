package com.samtec.crm.opportunityservice.opportunity;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-05T22:29:14+0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 14.0.2 (N/A)"
)
@Component
public class OpportunityMapperImpl implements OpportunityMapper {

    @Override
    public OpportunityDto toDto(Opportunity opportunity) {
        if ( opportunity == null ) {
            return null;
        }

        OpportunityDto opportunityDto = new OpportunityDto();

        opportunityDto.setOpportunityId( opportunity.getId() );

        return opportunityDto;
    }

    @Override
    public Opportunity fromDto(OpportunityDto opportunityDto) {
        if ( opportunityDto == null ) {
            return null;
        }

        Opportunity opportunity = new Opportunity();

        opportunity.setId( opportunityDto.getOpportunityId() );

        return opportunity;
    }
}
