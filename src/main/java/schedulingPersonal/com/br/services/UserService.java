package schedulingPersonal.com.br.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import schedulingPersonal.com.br.models.User;
import schedulingPersonal.com.br.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    public User addUser(User user) {
        userRepository.save(user);
        return user;
    }
}
