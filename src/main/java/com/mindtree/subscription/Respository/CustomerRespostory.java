package com.mindtree.subscription.Respository;

import com.mindtree.subscription.Entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRespostory extends JpaRepository<CustomerEntity, Long> {
}
