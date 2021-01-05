package com.samtec.crm.opportunityservice.source;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SourceRepository extends JpaRepository<Sources,Long> {
    List<Sources> findAllActive(boolean isDeleted);
}
