import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    @Test
    void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("1", "Jane", "Doe", "1234567890", "Address");

        service.addContact(contact);

        Contact stored = service.getContact("1");
        assertEquals("Jane", stored.getFirstName());
        assertEquals("Doe", stored.getLastName());
    }

    @Test
    void testDuplicateContactId() {
        ContactService service = new ContactService();
        Contact c1 = new Contact("1", "Jane", "Doe", "1234567890", "Address");
        Contact c2 = new Contact("1", "John", "Smith", "0987654321", "Address");

        service.addContact(c1);
        assertThrows(IllegalArgumentException.class, () -> service.addContact(c2));
    }

    @Test
    void testDeleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("1", "Jane", "Doe", "1234567890", "Address");

        service.addContact(contact);
        service.deleteContact("1");

        assertThrows(IllegalArgumentException.class, () -> service.getContact("1"));
    }

    @Test
    void testUpdateContactAllFields() {
        ContactService service = new ContactService();
        Contact contact = new Contact("1", "Jane", "Doe", "1234567890", "Address");

        service.addContact(contact);
        service.updateContact("1", "Janet", "Smith", "1112223333", "456 New St");

        Contact updated = service.getContact("1");
        assertEquals("Janet", updated.getFirstName());
        assertEquals("Smith", updated.getLastName());
        assertEquals("1112223333", updated.getPhone());
        assertEquals("456 New St", updated.getAddress());
    }
}
