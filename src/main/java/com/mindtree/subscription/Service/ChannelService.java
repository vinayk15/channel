package com.mindtree.subscription.Service;

import com.mindtree.subscription.Entity.ChannelEntity;

import java.util.List;
import java.util.Optional;

public interface ChannelService {
    public ChannelEntity channelSave(ChannelEntity channelEntity);

    public List<ChannelEntity> findAllChannel();

    public Optional<ChannelEntity> findByChannel(Long channelId);
}
