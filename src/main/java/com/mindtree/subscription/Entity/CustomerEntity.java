package com.mindtree.subscription.Entity;

import javax.persistence.*;


@Entity
@Table(name = "CUSTOMERS")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SubscriberId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "registered_mobile")
    private String registeredMobile;

    public Long getSubscriberId() {
        return SubscriberId;
    }

    public void setSubscriberId(Long subscriberId) {
        SubscriberId = subscriberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRegisteredMobile() {
        return registeredMobile;
    }

    public void setRegisteredMobile(String registeredMobile) {
        this.registeredMobile = registeredMobile;
    }
}
