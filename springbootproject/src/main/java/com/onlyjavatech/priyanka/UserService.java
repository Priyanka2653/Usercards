package com.onlyjavatech.priyanka;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public List<User> getAllUsers() {
    	 List<User> users = new ArrayList<>();
         users.add(new User("John Doe", "john.doe@ex.com", "https://example.com/avatar1.jpg"));
         users.add(new User("Jane Smith", "jane.smith@ex.com", "https://example.com/avatar2.jpg"));
         users.add(new User("Mike John", "mike.john@ex.com","https://example.com/avatar3.jpg"));
         return users;
    }
}
