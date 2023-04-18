package tn.numeryx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.numeryx.dto.GitLabProjectReq;
import tn.numeryx.dto.GitlabProjectResp;
import tn.numeryx.service.GitlabService;

@RestController
public class GitlabController {

    @Autowired
    private GitlabService gitlabService;

    @PostMapping("/projects")
    public ResponseEntity<GitlabProjectResp> createProject(@RequestBody GitLabProjectReq request) {
        GitlabProjectResp response = gitlabService.createProject(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
