package blog.services.interfaces;

import blog.models.Profile;

import java.util.UUID;

public interface ProfileService {

    public void saveProfile(Profile profile);

    public void editProfile(UUID idProfile);
    public void deleteProfile(UUID idProfile);
    public void followProfile(UUID idProfile);
    public void unFollowProfile(UUID idProfile);

}
