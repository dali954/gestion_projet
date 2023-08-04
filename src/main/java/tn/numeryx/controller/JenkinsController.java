package tn.numeryx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tn.numeryx.dto.JenkinsJobReq;
import tn.numeryx.dto.JenkinsJobResp;
import tn.numeryx.dto.JenkinsUserReq;
import tn.numeryx.dto.JenkinsUserResp;
import tn.numeryx.service.JenkinsService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/api/jenkins")
public class JenkinsController {

    private final JenkinsService jenkinsService;

    @Autowired
    public JenkinsController(JenkinsService jenkinsService) {
        this.jenkinsService = jenkinsService;
    }

    @PostMapping("/users")
    public ResponseEntity<JenkinsUserResp> createUserOnJenkins(@RequestBody JenkinsUserReq user) {
        JenkinsUserResp createdUser = jenkinsService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    // @PostMapping("/views")
    // public ResponseEntity<ViewDTO> createViewOnJenkins(@RequestBody ViewDTO view)
    // {
    // ViewDTO createdView = jenkinsService.createView(view);
    // return new ResponseEntity<>(createdView, HttpStatus.CREATED);
    // }

    // @PostMapping("/jobs/multibranch-pipeline")
    // public ResponseEntity<JenkinsJobResp>
    // createMultibranchPipelineJobOnJenkins(@RequestBody JenkinsJobReq job) {
    // JenkinsJobResp createdJob = jenkinsService.createMultibranchPipelineJob(job);
    // return new ResponseEntity<>(createdJob, HttpStatus.CREATED);
    // }

    // @PostMapping("/views/{viewId}/users")
    // public ResponseEntity<Void> assignUsersToView(@PathVariable("viewId") String
    // viewId, @RequestBody List<String> userIds) {
    // jenkinsService.assignUsersToView(viewId, userIds);
    // return new ResponseEntity<>(HttpStatus.OK);
    // }

    // @PostMapping("/jobs/{jobId}/users")
    // public ResponseEntity<Void> assignUsersToJob(@PathVariable("jobId") String
    // jobId, @RequestBody List<String> userIds) {
    // jenkinsService.assignUsersToJob(jobId, userIds);
    // return new ResponseEntity<>(HttpStatus.OK);
    // }

    // Ajouter d'autres méthodes pour les autres endpoints de l'API

}
