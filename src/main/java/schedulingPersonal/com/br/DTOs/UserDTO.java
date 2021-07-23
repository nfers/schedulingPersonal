package schedulingPersonal.com.br.DTOs;

public class UserDTO {
     Long  id;
     String name;
     String positions;
     String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    String email;
     Boolean status;

    public UserDTO(Long id, String name, String positions, String phone, String email, Boolean status) {
        this.id = id;
        this.name = name;
        this.positions = positions;
        this.phone = phone;
        this.email = email;
        this.status = status;
    }
}
