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
    @JsonProperty("private")
    private Boolean _private;
    @JsonProperty("created_at")
    private String createdAt;
    private String description;
    @JsonProperty("full_name")
    private String fullName;
    private String language;
    private String name;
    @JsonProperty("updated_at")
    private String updatedAt;
    private Owner owner;
}
