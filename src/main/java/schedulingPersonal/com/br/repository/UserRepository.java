package schedulingPersonal.com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import schedulingPersonal.com.br.models.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByStatus(boolean status);
    List<User> findByName(String name);


}
