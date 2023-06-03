package com.PuuNii.CRM.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.PuuNii.CRM.model.User;
import net.javaguides.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}