package com.samtec.crm.opportunityservice.opportunity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class OpportunityServiceImpl implements OpportunityService{

    @Autowired private OpportunityMapper mapper;

    @Autowired private OpportunityRepository opportunityRepository;

    @Override
    public List<OpportunityDto> fetchAll() {
        return opportunityRepository.findAllActive(false)
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<OpportunityDto> findById(long id) {
        return opportunityRepository.findById(id)
                .stream()
                .map(mapper::toDto)
                .findFirst();
    }

    @Override
    public OpportunityDto save(OpportunityDto opportunityDto) {
        Opportunity opportunity = mapper.fromDto(opportunityDto);
        return mapper.toDto(opportunityRepository.save(opportunity));
    }

    @Override
    public void delete(long id) {
        opportunityRepository.deleteById(id);
    }
}
