package com.samtec.crm.opportunityservice.source;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",uses = {Sources.class})
public interface SourceMapper {
    SourceMapper INSTANCE  = Mappers.getMapper(SourceMapper.class);

    @Mapping(source = "id",target = "sourceId")
    SourceDto toDto(Sources source);

    @Mapping(source = "sourceId",target = "id")
    Sources fromDto(SourceDto sourceDto);
}
