package dao.interfaces;

import model.Person;

public interface PersonDao {
    public void save(Person person);
    public void edid(long id);
    public void delete(long id);

}
