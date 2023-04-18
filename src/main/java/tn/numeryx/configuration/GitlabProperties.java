package tn.numeryx.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "gitlab")
public class GitlabProperties {

    private String apiUrl = "https://gitlab.com/api/v4";
    private String personalAccessToken = "glpat-fuam5v7VhRvfLrkT6sos";

}
