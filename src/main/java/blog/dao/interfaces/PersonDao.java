package blog.dao.interfaces;

import blog.model.Person;

public interface PersonDao {

    public void save(Person person);
    public void edit(long id);
    public void delete(long id);

}
