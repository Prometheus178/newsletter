package blog.services.interfaces;


import blog.models.Letter;

import java.util.List;

public interface LetterService {

    public void createLetter(Letter letter);
    public void edit(long id);
    public void sendLetter(long id);
    public void delete(long id);
    List<Letter> selectedLetters();
}
