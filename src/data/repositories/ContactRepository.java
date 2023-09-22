package data.repositories;

import data.models.Contact;

public interface ContactRepository {
    Contact save(Contact contact);
    void delete(Contact contact);
    Contact findById(int id);
    Iterable <Contact> findAll();
    long count();
    void clear();

}
