package blog.model;

import java.time.LocalDate;
import java.util.UUID;

public class RegistrationProfile {

    private UUID id;
    private String email;
    private String password;
    private LocalDate dateBirthday;
    private Gender gender;

    public RegistrationProfile(UUID id, String email, String password, LocalDate dateBirthday, Gender gender) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.dateBirthday = dateBirthday;
        this.gender = gender;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDateBirthday(LocalDate dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

}
