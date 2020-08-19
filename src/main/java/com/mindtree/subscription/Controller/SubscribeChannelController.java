package com.mindtree.subscription.Controller;

import com.mindtree.subscription.Entity.SubscribeChannelEntity;
import com.mindtree.subscription.Service.SubscribeChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/api/subscribe/v1")
public class SubscribeChannelController {

    @Autowired
    private SubscribeChannelService subscribeChannelService;

    @RequestMapping(value = "/subscribeChannel", method = RequestMethod.POST)
    public SubscribeChannelEntity subscribeChannel(@RequestBody SubscribeChannelEntity subscribeChannelEntity) throws Exception {
       
        SubscribeChannelEntity channelEntity = subscribeChannelService.subscribeChannelSave(subscribeChannelEntity);

        if (channelEntity == null) {
            throw new Exception("No Record found");
        }
        return channelEntity;
    }
}
