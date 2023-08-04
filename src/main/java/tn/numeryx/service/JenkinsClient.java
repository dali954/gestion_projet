package tn.numeryx.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import feign.Headers;
import tn.numeryx.dto.JenkinsUserReq;
import tn.numeryx.dto.JenkinsUserResp;

@FeignClient(name = "jenkinsClient", url = "http://192.168.190.129:8080")
public interface JenkinsClient {

    // @Headers("Content-Type: application/json")
    // @GetMapping("/crumbIssuer/api/json")
    // Map<String, String> getCrumb(@RequestHeader("Authorization") String
    // authorization);

    // @Headers({
    // "Content-Type: application/json",
    // "{Jenkins-Crumb}:{6938355d098ee4aadc67b9547eaa37e84eab6c85043a11f916c19956593cd96b1885697b9558bc48f38f4b6b0b2adb86c1dbaae9b61970b882af43f6ca006f3c}"
    // })
    @Headers("Content-Type: application/json")
    @RequestMapping(method = RequestMethod.POST, value = "/securityRealm/createAccountByAdmin")
    JenkinsUserResp createUser(
            @RequestHeader("Authorization") String authorization,
            // @RequestHeader("Jenkins-Crumb") String crumb,
            @RequestBody JenkinsUserReq user);

    // @PostMapping("/views")
    // ViewDTO createView(@RequestHeader("Authorization") String authorization,
    // @RequestBody ViewDTO view);

    // @PostMapping("createItem")
    // JenkinsJobResp createMultibranchPipelineJob(@RequestHeader("Authorization")
    // String authorization,
    // @RequestBody JenkinsJobReq job);

    // @PostMapping("/views/{viewId}/users")
    // void assignUsersToView(@RequestHeader("Authorization") String authorization,
    // @PathVariable("viewId") String viewId, @RequestBody List<String> userIds);

    // @PostMapping("/jobs/{jobId}/users")
    // void assignUsersToJob(@RequestHeader("Authorization") String authorization,
    // @PathVariable("jobId") String jobId, @RequestBody List<String> userIds);

    // Ajouter d'autres méthodes pour les autres endpoints de l'API Jenkins

}
