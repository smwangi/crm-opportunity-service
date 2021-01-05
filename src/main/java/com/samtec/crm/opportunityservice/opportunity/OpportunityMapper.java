package com.samtec.crm.opportunityservice.opportunity;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",uses = {Opportunity.class})
public interface OpportunityMapper {
    OpportunityMapper INSTANCE = Mappers.getMapper(OpportunityMapper.class);

    @Mapping(source = "id",target = "opportunityId")
    OpportunityDto toDto(Opportunity opportunity);

    @Mapping(source = "opportunityId",target = "id")
    Opportunity fromDto(OpportunityDto opportunityDto);
}
