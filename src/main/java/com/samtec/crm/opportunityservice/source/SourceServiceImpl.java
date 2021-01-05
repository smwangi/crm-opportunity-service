package com.samtec.crm.opportunityservice.source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SourceServiceImpl implements SourceService{
    
    @Autowired
    private SourceRepository sourceRepository;

    @Autowired
    private SourceMapper mapper;

    @Override
    public List<SourceDto> fetchAll() {
        return  sourceRepository.findAllActive(false)
        .stream()
        .map(mapper::toDto)
        .collect(Collectors.toList());
    }

    @Override
    public Optional<SourceDto> findById(long id) {
        return sourceRepository.findById(id)
                .stream()
                .map(mapper::toDto)
                .findFirst();
    }

    @Override
    public SourceDto save(SourceDto sourceDto) {
        Sources source = mapper.fromDto(sourceDto);
        return mapper.toDto(sourceRepository.save(source));
    }

    @Override
    public void delete(long id) {
        sourceRepository.deleteById(id);
    }
}
