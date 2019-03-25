package com.study;

import org.springframework.beans.factory.annotation.Autowired;


public class Basa {

    @Autowired
    UserRepository userRepository;

    boolean save(User user){
        try {
            userRepository.save(user);
            return true;
        }catch (Throwable t){
            System.out.println(t);
            return false;
        }

    }
//
//    User findById(Integer id){
//        return userRepository.findById(id);
//    }

}
