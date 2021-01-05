package com.samtec.crm.opportunityservice.opportunity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OpportunityRepository extends JpaRepository<Opportunity,Long> {
    List<Opportunity> findAllActive(boolean isDeleted);
    List<Opportunity> findAllBySource(long sourceId);
}
