package com.mindtree.subscription.Respository;

import com.mindtree.subscription.Entity.SubscribeChannelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscribeChannelRespositry extends JpaRepository<SubscribeChannelEntity, Long> {
}
