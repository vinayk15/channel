package com.mindtree.subscription.Controller;

import com.mindtree.subscription.Entity.ChannelEntity;
import com.mindtree.subscription.Service.ChannelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/channel/v1")
public class ChannelsRestController {
    private static final Logger logger = LoggerFactory.getLogger(CustomerRestController.
            class);

    @Autowired
    private ChannelService channelServicel;

    @RequestMapping(value = "/channelSave", method = RequestMethod.POST)
    public String ChannelSave(@RequestBody ChannelEntity channelEntity) throws Exception {
        logger.info("Enter Inside Channel Save (){}");
        ChannelEntity entity = channelServicel.channelSave(channelEntity);
        if (entity == null) {
            throw new Exception("Channel Infromation Not Saved");
        }
        logger.info("Exit Inside findALlChannel (){}");
        return "Channel Information Save Successfully";
    }

    @RequestMapping(value = "/findAllChannels")
    public List<ChannelEntity> findALlChannel() throws Exception {
        logger.info("Enter Inside findALlChannel (){}");
        List<ChannelEntity> entityList = new ArrayList<>();
        try {
            entityList = channelServicel.findAllChannel();
        } catch (Exception ex) {
            logger.error("No Record found exception " + ex);
        }
        logger.info("Exit  findALlChannel (){}");
        return entityList;
    }
}
