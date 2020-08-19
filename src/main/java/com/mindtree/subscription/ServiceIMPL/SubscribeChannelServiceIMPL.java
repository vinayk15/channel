package com.mindtree.subscription.ServiceIMPL;

import com.mindtree.subscription.Entity.ChannelEntity;
import com.mindtree.subscription.Entity.SubscribeChannelEntity;
import com.mindtree.subscription.Respository.SubscribeChannelRespositry;
import com.mindtree.subscription.Service.ChannelService;
import com.mindtree.subscription.Service.SubscribeChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class SubscribeChannelServiceIMPL implements SubscribeChannelService {
    @Autowired
    private SubscribeChannelRespositry subscribeChannelRespositry;

    private ChannelService channelService;

    @Override
    public SubscribeChannelEntity subscribeChannelSave(SubscribeChannelEntity subscribeChannelEntity) {
        SubscribeChannelEntity entity = new SubscribeChannelEntity();
        Optional<ChannelEntity> channelEntity = channelService.findByChannel(subscribeChannelEntity.getSubscribeChannelId());
        if (channelEntity.isPresent()) {
            subscribeChannelEntity.setSubscribeCost(channelEntity.get().getCostPerChannel());
            subscribeChannelEntity.setSubscribeDate(new Date());
            entity = subscribeChannelRespositry.save(subscribeChannelEntity);
            return entity;
        }
        return entity;
    }
}
