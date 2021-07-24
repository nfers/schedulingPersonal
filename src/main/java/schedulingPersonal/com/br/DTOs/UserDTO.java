package schedulingPersonal.com.br.DTOs;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import schedulingPersonal.com.br.models.User;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserDTO {

     Long  id;
     String name;
     String positions;
     String phone;
     String email;
     boolean status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPositions() {
        return positions;
    }

    public void setPositions(String positions) {
        this.positions = positions;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public User transformToObject() {
        return new User(id, name, positions,  phone, email,  status);
    }

    /*public static UserDTO transformToObject(User user) {
        return new UserDTO(user.id, user.name, user.positions,  user.phone, user.email,  user.status);
    }*/

}
