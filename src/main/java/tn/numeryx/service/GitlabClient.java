package tn.numeryx.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import feign.Headers;
import tn.numeryx.dto.GitLabProjectReq;
import tn.numeryx.dto.GitlabProjectResp;

@FeignClient(name = "gitlab", url = "https://gitlab.com/api/v4")
public interface GitlabClient {

    // @PostMapping(value = "/projects", consumes =
    // MediaType.APPLICATION_JSON_VALUE)
    // GitlabProjectResp createProject(@RequestBody GitLabProjectReq request);

    @Headers("Content-Type: application/json")
    @RequestMapping(method = RequestMethod.POST, value = "/projects")
    GitlabProjectResp completions(@RequestHeader("PRIVATE-TOKEN: <glpat-fuam5v7VhRvfLrkT6sos>") String authorization,
            @RequestBody GitLabProjectReq requestBody);
    // Ajouter d'autres méthodes pour les autres endpoints de l'API GitLab

}
