package com.samtec.crm.opportunityservice.opportunity;

import com.samtec.crm.opportunityservice.common.BaseEntity;
import com.samtec.crm.opportunityservice.opportunitytype.OpportunityType;
import com.samtec.crm.opportunityservice.source.Sources;

import javax.persistence.*;

@Entity
@Table(name = "opportunities")
public class Opportunity extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "source_id")
    private Sources sources;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id")
    private OpportunityType opportunityTypes;

    public Sources getSources() {
        return sources;
    }

    public void setSources(Sources sources) {
        this.sources = sources;
    }
}
