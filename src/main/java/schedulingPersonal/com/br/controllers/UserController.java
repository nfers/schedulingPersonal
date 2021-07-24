package schedulingPersonal.com.br.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import schedulingPersonal.com.br.DTOs.UserDTO;
import schedulingPersonal.com.br.models.User;
import schedulingPersonal.com.br.services.UserService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping()
    public ResponseEntity<User>  create(@RequestBody UserDTO user){
        try {
            User newUser = userService.save(user.transformToObject());

            return new ResponseEntity<>(newUser, HttpStatus.CREATED);
        } catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
