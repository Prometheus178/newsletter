package blog.dao.interfaces;

import blog.models.Profile;

import java.util.UUID;

public interface ProfileDao {

    public void saveProfile(Profile profile);

    public void editProfile(UUID id);
    public void deleteProfile(UUID id);
    public void followProfile(UUID id);
    public void unFollowProfile(UUID id);
}
