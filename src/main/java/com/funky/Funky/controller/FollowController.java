package com.funky.Funky.controller;

import com.funky.Funky.model.FollowRequest;
import com.funky.Funky.service.FollowService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FollowController {

    private FollowService followService;

    @PostMapping("createFollowRequest")
    private void createFollowRequest(@RequestBody FollowRequest followRequest){
        followService.createFollowRequest(followRequest);
    }

    @PatchMapping("acceptFollowRequest")
    private void acceptFollowRequest(@RequestBody FollowRequest followRequest){
        followService.acceptFollowRequest(followRequest);
    }

}
