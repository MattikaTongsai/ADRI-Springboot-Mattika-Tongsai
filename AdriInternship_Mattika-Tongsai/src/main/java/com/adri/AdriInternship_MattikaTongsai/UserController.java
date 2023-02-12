package com.adri.AdriInternship_MattikaTongsai;
import org.springframework.beans.factory.annotation.Autowired;
//lsimport org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiUser")
public class UserController {
    @GetMapping("/mattikatongsai")
    public String HelloWorld()
    {
    return "Hello messgae";
    }

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{user_name}")
    public User findOne(@PathVariable String user_name) {
        return userRepository.findByUserName(user_name);
    }

    @PostMapping
    //@ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user){
        return userRepository.save(user);
    } 
}