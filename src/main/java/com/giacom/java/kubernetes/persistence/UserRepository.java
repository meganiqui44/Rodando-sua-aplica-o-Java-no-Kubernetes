package com.doug.java.kubernetes.persistence;

import org.springframework.data.repository.CrudRepository;

import com.doug.java.kubernetes.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}

