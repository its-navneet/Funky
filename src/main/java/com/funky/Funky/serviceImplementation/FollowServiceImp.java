package com.funky.Funky.serviceImplementation;

import com.funky.Funky.model.FollowRequest;
import com.funky.Funky.repository.FollowRequestRepositoy;
import com.funky.Funky.repository.FollowerRepository;
import com.funky.Funky.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;

public class FollowServiceImp implements FollowService {
    @Autowired
    private FollowRequestRepositoy followRequestRepositoy;

    @Override
    public void createFollowRequest(FollowRequest followRequest) {
//        followRequest.setSenderUserId();
        followRequestRepositoy.save(followRequest);
    }

    @Override
    public void acceptFollowRequest(FollowRequest followRequest) {

    }
}
