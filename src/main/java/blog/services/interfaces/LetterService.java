package blog.services.interfaces;


import blog.models.Letter;

import java.util.List;

public interface LetterService {

    public void createLetter(Letter letter);
    public void editLetter(long idLetter);
    public void sendLetter(long idLetter);
    public void deleteFromBase(long idLetter);
    List<Letter> listLetters();
}
