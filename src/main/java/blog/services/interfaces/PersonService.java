package blog.services.interfaces;

import blog.model.Person;

public interface PersonService {

    public void save(Person person);
    public void edit(long id);
    public void delete(long id);

}
