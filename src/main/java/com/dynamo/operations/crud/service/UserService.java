package com.dynamo.operations.crud.service;

import com.dynamo.operations.crud.dto.UserDTO;
import com.dynamo.operations.crud.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> getUsers();


    User getUser(Integer id);

    void updateUser(Integer id, User user);

    void deleteUser(Integer id);

    void updateName(Integer id, UserDTO userDTO);
}
