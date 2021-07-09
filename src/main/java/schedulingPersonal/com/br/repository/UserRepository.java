package schedulingPersonal.com.br.repository;

import org.springframework.data.repository.CrudRepository;
import schedulingPersonal.com.br.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
