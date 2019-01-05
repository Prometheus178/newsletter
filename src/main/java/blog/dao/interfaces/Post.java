package blog.dao.interfaces;

import java.util.List;

public interface Post {
    public void save(Post post);
    public void edit(long id);
    public void delete(long id);
    List<Post> randomPosts();
}
