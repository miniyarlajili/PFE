/*package com.hotelApplication.Services.impliment;

import com.hotelApplication.DTO.LoginDTO;
import com.hotelApplication.DTO.UserDTO;
import com.hotelApplication.Repository.userRepository;
import com.hotelApplication.Response.LoginResponse;
import com.hotelApplication.Services.userService;
import com.hotelApplication.models.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class userimpliment implements userService {
    @Autowired
    private userRepository userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;


    public String addUser(UserDTO userDTO) {
        user user = new user();
        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));

        userRepo.save(user);
        return user.getName();
    }

    @Override
    public LoginResponse loginUser(LoginDTO loginDTO) {
        String msg = "";
       user user1 = userRepo.findByEmail(loginDTO.getEmail());
        if (user1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<user> user = userRepo.findByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginResponse ("Login Success", true);
                } else {
                    return new LoginResponse ("Login Failed", false);
                }
            } else {
                return new LoginResponse ("password Not Match", false);
            }
        }else {
            return new LoginResponse ("Email not exits", false);
        }
    }
    }*/


