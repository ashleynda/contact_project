package test;

import data.models.Contact;
import data.repositories.ContactRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactRepositoryImplTest {
    private ContactRepositoryImpl contactRepository;

    @BeforeEach
    public void startWithThis() {
        contactRepository = new ContactRepositoryImpl();
    }
    @Test
    public void saveOneContact_CountIsOneTest() {
        Contact contact = new Contact();
        contactRepository.save(contact);
        assertEquals(1, contactRepository.count());
    }
    @Test
    public void saveOneContact_FindByIdTest() {
        Contact contact = new Contact();
        contactRepository.save(contact);
        assertEquals(1, contactRepository.count());
        assertEquals(contact, contactRepository.findById(1));
    }
    
}
