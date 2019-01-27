package blog.dao.interfaces;

import java.util.List;

public interface Letter {

    public void saveLetter(Letter letter);
    public void editLetter(long id);
    public void deleteLetter(long id);
    List<Letter> selectedLetter();
}
