package blog.models;

import java.time.LocalDate;
import java.util.UUID;

public class RegistrationProfile {

    private UUID idProfile;
    private String email;
    private String password;
    private LocalDate dateBirthday;
    private Gender gender;

    public RegistrationProfile(UUID idProfile, String email, String password, LocalDate dateBirthday, Gender gender) {
        this.idProfile = idProfile;
        this.email = email;
        this.password = password;
        this.dateBirthday = dateBirthday;
        this.gender = gender;
    }

    public void setIdProfile(UUID idProfile) {
        this.idProfile = idProfile;
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
