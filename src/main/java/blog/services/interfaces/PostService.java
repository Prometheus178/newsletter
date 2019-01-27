package blog.services.interfaces;

import blog.dao.interfaces.Letter;

import java.util.List;

public interface PostService {

    public void saveLetter(Letter letter);
    public void edit(long id);
    public void sendLetter(long id);
    public void delete(long id);
    List<Letter> selectedLetters();
}
