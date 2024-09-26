package com.funky.Funky.service;

import com.funky.Funky.model.FollowRequest;

public interface FollowService {
    void createFollowRequest(FollowRequest followRequest);

    void acceptFollowRequest(FollowRequest followRequest);
}
