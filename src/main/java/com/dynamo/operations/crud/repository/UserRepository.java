package com.dynamo.operations.crud.repository;


import com.dynamo.operations.crud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}