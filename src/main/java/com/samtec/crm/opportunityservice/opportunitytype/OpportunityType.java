package com.samtec.crm.opportunityservice.opportunitytype;

import com.samtec.crm.opportunityservice.common.BaseEntity;
import com.samtec.crm.opportunityservice.opportunity.Opportunity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "opportunity_types")
public class OpportunityType extends BaseEntity {

    @Column(name = "name",unique = true,nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "opportunityTypes",cascade = CascadeType.ALL)
    private Set<Opportunity> opportunities = new HashSet<>();
}
