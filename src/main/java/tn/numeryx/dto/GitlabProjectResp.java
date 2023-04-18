package tn.numeryx.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class GitlabProjectResp {

    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("webUrl")
    private String webUrl;
    @JsonProperty("sshUrl")
    private String sshUrl;
    @JsonProperty("httpUrl")
    private String httpUrl;

}
