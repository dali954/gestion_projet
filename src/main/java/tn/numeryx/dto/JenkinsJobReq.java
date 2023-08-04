package tn.numeryx.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class JenkinsJobReq {

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

}
