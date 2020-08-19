package com.mindtree.subscription.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CHANNEL")
public class ChannelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "channel_id")
    private Long channelId;
    @Column(name = "channel_name")
    private String channelName;
    @Column(name = "cost_per_month")
    private double costPerChannel;


    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public double getCostPerChannel() {
        return costPerChannel;
    }

    public void setCostPerChannel(double costPerChannel) {
        this.costPerChannel = costPerChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChannelEntity that = (ChannelEntity) o;
        return Double.compare(that.costPerChannel, costPerChannel) == 0 &&
                Objects.equals(channelId, that.channelId) &&
                Objects.equals(channelName, that.channelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelId, channelName, costPerChannel);
    }
}
