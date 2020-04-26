package com.webservice.mobile.app.service;

import com.webservice.mobile.app.shared.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO getUser(String email);
}