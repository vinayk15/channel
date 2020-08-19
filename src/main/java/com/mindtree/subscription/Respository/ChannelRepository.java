package com.mindtree.subscription.Respository;

import com.mindtree.subscription.Entity.ChannelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepository extends JpaRepository<ChannelEntity, Long> {

}
