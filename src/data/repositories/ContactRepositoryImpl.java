package data.repositories;

import data.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactRepositoryImpl implements ContactRepository {

    private List<Contact> contacts = new ArrayList<>();


    @Override
    public Contact save(Contact contact) {
        if (contact.getId() == 0) saveNew(contact);
        else update(contact);
        return contact;

    }
    private void saveNew(Contact contact) {
        contact.setId(generateId());
        contacts.add(contact);
    }

    private void update(Contact contact) {
        Contact contact1 = findById(contact.getId());
        contact.setName(contact.getName());
    }

    @Override
    public void delete(Contact contact) {

    }

    @Override
    public Contact findById(int id) {
        for (Contact contact: contacts ) {
            if (contact.getId() == id) return contact;
        }
        return null;
    }

    @Override
    public Iterable<Contact> findAll() {
        return null;
    }

    @Override
    public long count() {
        return contacts.size();
    }

    @Override
    public void clear() {

    }
    private int generateId() {
        return contacts.size() + 1;
    }

}
