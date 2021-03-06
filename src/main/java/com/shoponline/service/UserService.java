package com.shoponline.service;

import com.shoponline.exception.NotAuthorizedException;
import com.shoponline.exception.ResourceAlreadyExistsException;
import com.shoponline.model.dto.UserCredentialsDTO;
import com.shoponline.model.entity.Customer;
import com.shoponline.model.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Created by Damian on 2017-01-21.
 */
public interface UserService {

    User createCustomer(Customer customer);

    UserCredentialsDTO isAuthorized(UserCredentialsDTO userCredentialsDTO);

    UserCredentialsDTO create(UserCredentialsDTO userCredentialsDTO);

}
