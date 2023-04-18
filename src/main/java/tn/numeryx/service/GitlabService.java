package tn.numeryx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.numeryx.configuration.GitlabProperties;
import tn.numeryx.dto.GitLabProjectReq;
import tn.numeryx.dto.GitlabProjectResp;

@Service
public class GitlabService {

    @Autowired
    private GitlabClient gitlabClient;

    @Autowired
    private GitlabProperties gitlabProperties;

    public GitlabService(GitlabClient gitlabClient, GitlabProperties gitlabProperties) {
        this.gitlabClient = gitlabClient;
        this.gitlabProperties = gitlabProperties;
    }

    public GitlabProjectResp createProject(GitLabProjectReq request) {
        String authorization = gitlabProperties.getPersonalAccessToken();
        return gitlabClient.completions(authorization, request);
    }

    // Ajouter d'autres méthodes pour les autres endpoints de l'API GitLab

}
