package dk.mercantec.javaii;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContactsTest {

    @Test
    public void testAddInternalContact() throws Exception {
        Contacts contacts = new Contacts();
        contacts.AddInternalContact("Name", "Phone", "Email", "Department");
        assertEquals(contacts.getContacts().get(0).getName(), "Name");
        assertEquals(contacts.getContacts().get(0).getPhone(), "Phone");
        assertEquals(contacts.getContacts().get(0).getEmail(), "Email");
    }

    @Test
    public void testAddExternalContact() throws Exception {
        Contacts contacts = new Contacts();
        contacts.AddExternalContact("Name", "Phone", "Email", "Department");
        assertEquals(contacts.getContacts().get(0).getName(), "Name");
        assertEquals(contacts.getContacts().get(0).getPhone(), "Phone");
        assertEquals(contacts.getContacts().get(0).getEmail(), "Email");
    }
}