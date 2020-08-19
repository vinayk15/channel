package com.mindtree.subscription.ServiceIMPL;

import com.mindtree.subscription.Entity.ChannelEntity;
import com.mindtree.subscription.Respository.ChannelRepository;
import com.mindtree.subscription.Service.ChannelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ChannelServiceIMPL implements ChannelService {
    private static final Logger logger = LoggerFactory.getLogger(ChannelServiceIMPL.
            class);
    @Autowired
    private ChannelRepository channelRepository;

    @Override
    public ChannelEntity channelSave(ChannelEntity channelEntity) {
        return channelRepository.save(channelEntity);
    }

    @Override
    public List<ChannelEntity> findAllChannel() {
        List<ChannelEntity> channelEntities = new ArrayList<>();
        try {
            channelEntities = channelRepository.findAll();

        } catch (Exception ex) {
            logger.error("SQL Excepation" + ex);
        }

        return channelEntities;
    }

    @Override
    public Optional<ChannelEntity> findByChannel(Long channelId) {
        Optional<ChannelEntity> channelEntity = channelRepository.findById(channelId);
        return channelEntity;
    }
}
