package com.onlyjavatech.priyanka;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletResponse;


@Controller

public class TestController {

	@Autowired
    private UserService userService;

    @GetMapping("/users")
    public String getUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "user-list";
    }
    
    @GetMapping("/users/{name}")
    public String getUserDetails(@PathVariable String name, Model model) {
        // Fetch the user details based on the name
    	List<User> users = userService.getAllUsers();
         User user = users.stream()
                .filter(u -> u.getName().equals(name))
                .findFirst()
                .orElse(null);

        if (user == null) {
            System.out.println("user not found");
        }

        model.addAttribute("user", user);
        return "user-details";
    }
    
    

    @PostMapping("/download")
    public void downloadUserDetail(@RequestParam("content") String content, HttpServletResponse response) throws IOException {
        response.setContentType("image/jpeg");
        response.setHeader("Content-Disposition", "attachment; filename=user_detail.jpg");

        byte[] contentBytes = content.getBytes();
        try (OutputStream outputStream = response.getOutputStream()) {
            outputStream.write(contentBytes);
            outputStream.flush();
        }
    }
    
    
}
