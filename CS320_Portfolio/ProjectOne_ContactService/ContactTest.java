import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    void testValidContactCreation() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("12345", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    @Test
    void testContactIdCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact(null, "John", "Doe", "1234567890", "Address")
        );
    }

    @Test
    void testContactIdCannotBeTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345678901", "John", "Doe", "1234567890", "Address")
        );
    }

    @Test
    void testFirstNameCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("1", null, "Doe", "1234567890", "Address")
        );
    }

    @Test
    void testFirstNameCannotBeTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("1", "ThisNameIsTooLong", "Doe", "1234567890", "Address")
        );
    }

    @Test
    void testLastNameCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("1", "John", null, "1234567890", "Address")
        );
    }

    @Test
    void testLastNameCannotBeTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("1", "John", "ThisLastNameIsTooLong", "1234567890", "Address")
        );
    }

    @Test
    void testPhoneCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("1", "John", "Doe", null, "Address")
        );
    }

    @Test
    void testPhoneMustBeExactlyTenDigits() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("1", "John", "Doe", "123", "Address")
        );
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("1", "John", "Doe", "12345678901", "Address")
        );
    }

    @Test
    void testAddressCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("1", "John", "Doe", "1234567890", null)
        );
    }

    @Test
    void testAddressCannotBeTooLong() {
        String longAddress = "1234567890123456789012345678901"; // 31 chars
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("1", "John", "Doe", "1234567890", longAddress)
        );
    }
}
