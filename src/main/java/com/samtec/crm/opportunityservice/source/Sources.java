package com.samtec.crm.opportunityservice.source;

import com.samtec.crm.opportunityservice.common.BaseEntity;
import com.samtec.crm.opportunityservice.opportunity.Opportunity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "sources")
public class Sources extends BaseEntity {

    @OneToMany(mappedBy = "sources",cascade = CascadeType.ALL)
    private Set<Opportunity> opportunities;
}
