package tn.numeryx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import tn.numeryx.configuration.JenkinsProperties;
import tn.numeryx.dto.JenkinsJobReq;
import tn.numeryx.dto.JenkinsJobResp;
import tn.numeryx.dto.JenkinsUserReq;
import tn.numeryx.dto.JenkinsUserResp;

import java.util.List;

@Service
public class JenkinsService {

    private JenkinsClient jenkinsClient;
    private JenkinsProperties jenkinsProperties;

    @Autowired
    public JenkinsService(JenkinsClient jenkinsClient, JenkinsProperties jenkinsProperties) {
        this.jenkinsClient = jenkinsClient;
        this.jenkinsProperties = jenkinsProperties;
    }

    public JenkinsUserResp createUser(JenkinsUserReq user) {
        System.out.println("test ==============================");
        String authorization = "Basic " + Base64Utils
                .encodeToString((jenkinsProperties.getUsername() + ":" +
                        jenkinsProperties.getPassword()).getBytes());
        System.out.println(authorization);

        System.out.println("test ==============================");
        // String crumb = jenkinsProperties.getJenkinsCrumb();
        // System.out.println(crumb);
        return jenkinsClient.createUser(authorization, user);
    }

    // public ViewDTO createView(ViewDTO view) {
    // String authorization = "Bearer " + jenkinsProperties.getApiToken();
    // return jenkinsClient.createView(authorization, view);
    // }

    // public JenkinsJobResp createMultibranchPipelineJob(JenkinsJobReq job) {
    // String authorization = "Jenkins-Crumb" + jenkinsProperties.getJenkinsCrumb();
    // return jenkinsClient.createMultibranchPipelineJob(authorization, job);
    // }

    // public void assignUsersToView(String viewId, List<String> userIds) {
    // String authorization = "Bearer " + jenkinsProperties.getApiToken();
    // jenkinsClient.assignUsersToView(authorization, viewId, userIds);
    // }

    // public void assignUsersToJob(String jobId, List<String> userIds) {
    // String authorization = "Bearer " + jenkinsProperties.getApiToken();
    // jenkinsClient.assignUsersToJob(authorization, jobId, userIds);
    // }

    // Ajouter d'autres méthodes pour les autres endpoints de l'API Jenkins

}
