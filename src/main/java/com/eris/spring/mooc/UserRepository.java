package com.eris.spring.mooc;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eris.spring.mooc.io.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
