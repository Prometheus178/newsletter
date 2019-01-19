package blog.services.interfaces;

import blog.dao.interfaces.Post;

import java.util.List;

public interface PostService {

    public void save(Post post);
    public void edit(long id);
    public void delete(long id);
    List<Post> selectedPosts();
}
