package blog.services.interfaces;

import blog.model.Profile;

import java.util.UUID;

public interface ProfileService {

    public void saveProfile(Profile profile);

    public void editProfile(UUID id);
    public void deleteProfile(UUID id);
    public void followProfile(UUID id);
    public void unFollowProfile(UUID id);

}
