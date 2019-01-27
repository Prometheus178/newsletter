package blog.models;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Profile {
    private final UUID idProfile;
    private final String email;
    private final String password;
    private final LocalDate dateBirthday;
    private final List<UUID> followList;
    private final List<UUID> followerList;
    private final Gender gender;


    public Profile(UUID idProfile, String email, String password, LocalDate dateBirthday, List<UUID> followList, List<UUID> followerList, Gender gender) {
        this.idProfile = idProfile;
        this.email = email;
        this.password = password;
        this.dateBirthday = dateBirthday;
        this.followList = followList;
        this.followerList = followerList;
        this.gender = gender;
    }

}
