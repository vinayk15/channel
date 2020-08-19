package com.mindtree.subscription.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "subscribe_channel")
public class SubscribeChannelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subscribe_id")
    private long subscribeID;

    @Column(name = "subscribe_cost")
    private Double subscribeCost;
    @Column(name = "subscribe_channel_id")
    private Long subscribeChannelId;
    @Column(name = "subscribe_name")
    private Long subscriberName;
    @Column(name = "subscribe_date")
    private Date subscribeDate;

    public long getSubscribeID() {
        return subscribeID;
    }

    public void setSubscribeID(long subscribeID) {
        this.subscribeID = subscribeID;
    }

    public Double getSubscribeCost() {
        return subscribeCost;
    }

    public void setSubscribeCost(Double subscribeCost) {
        this.subscribeCost = subscribeCost;
    }

    public Long getSubscribeChannelId() {
        return subscribeChannelId;
    }

    public void setSubscribeChannelId(Long subscribeChannelId) {
        this.subscribeChannelId = subscribeChannelId;
    }

    public Long getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(Long subscriberName) {
        this.subscriberName = subscriberName;
    }

    public Date getSubscribeDate() {
        return subscribeDate;
    }

    public void setSubscribeDate(Date subscribeDate) {
        this.subscribeDate = subscribeDate;
    }
}
