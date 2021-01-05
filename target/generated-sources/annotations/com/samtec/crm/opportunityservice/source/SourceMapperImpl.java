package com.samtec.crm.opportunityservice.source;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-05T22:29:14+0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 14.0.2 (N/A)"
)
@Component
public class SourceMapperImpl implements SourceMapper {

    @Override
    public SourceDto toDto(Sources source) {
        if ( source == null ) {
            return null;
        }

        SourceDto sourceDto = new SourceDto();

        if ( source.getId() != null ) {
            sourceDto.setSourceId( source.getId() );
        }

        return sourceDto;
    }

    @Override
    public Sources fromDto(SourceDto sourceDto) {
        if ( sourceDto == null ) {
            return null;
        }

        Sources sources = new Sources();

        sources.setId( sourceDto.getSourceId() );

        return sources;
    }
}
