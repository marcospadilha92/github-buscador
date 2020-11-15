package com.marcos.githubbuscador.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RepositorySummary {
    private boolean _private;
    @JsonProperty("create_at")
    private String createdAt;
    private String description;
    @JsonProperty("full_name")
    private String fullName;
    private String type;
    private String language;
    private String name;
    private String owner;
    @JsonProperty("updated_at")
    private String updatedAt;
}
