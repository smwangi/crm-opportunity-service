package com.samtec.crm.opportunityservice.source;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class SourceDto {


    private long sourceId;

    private String name;

    private String description;


    public long getSourceId() {
        return sourceId;
    }

    public void setSourceId(long sourceId) {
        this.sourceId = sourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SourceDto{" +
                "id=" + sourceId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
