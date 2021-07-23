package schedulingPersonal.com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import schedulingPersonal.com.br.models.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByStatus(boolean status);
    List<User> findByName(String name);


}
