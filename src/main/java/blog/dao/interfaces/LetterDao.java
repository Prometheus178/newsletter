package blog.dao.interfaces;

import java.util.List;

public interface LetterDao {

    public void createLetter(LetterDao letter);
    public void edit(long id);
    public void sendLetter(long id);
    public void delete(long id);
    List<LetterDao> selectedLetters();
}
