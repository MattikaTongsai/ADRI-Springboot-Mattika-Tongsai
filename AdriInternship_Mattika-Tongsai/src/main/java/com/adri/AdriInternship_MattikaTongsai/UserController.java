package com.adri.AdriInternship_MattikaTongsai;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello-Mattika")
public class UserController {
    @GetMapping("/Hello-Mattika")
    public String HelloWorld()
    {
    return "Hello messgae";
    }

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/Hello-Mattika")
    public User findByUserName(@PathVariable String userName) {
        return userRepository.findByUserName(userName);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user){
        return userRepository.save(user);
    } 
}