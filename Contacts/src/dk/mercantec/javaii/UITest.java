package dk.mercantec.javaii;

import org.junit.Test;

import static org.junit.Assert.*;

public class UITest {

    @Test
    public void testMainMenu() throws Exception {
        Contacts contact = new Contacts();
        contact.AddInternalContact("Name", "Phone", "Email", "Department");
        UI ui = new UI(contact);
        Menu menu = ui.MainMenu();
        assertNotNull(menu);
    }


    @Test
    public void testListContactsMenu() throws Exception {
        Contacts contact = new Contacts();
        contact.AddInternalContact("Name", "Phone", "Email", "Department");
        UI ui = new UI(contact);
        Menu menu = ui.ListContactsMenu();
        assertNotNull(menu);
    }

    @Test
    public void testAddContactsMenu() throws Exception {
        Contacts contact = new Contacts();
        contact.AddInternalContact("Name", "Phone", "Email", "Department");
        UI ui = new UI(contact);
        Menu menu = ui.AddContactsMenu();
        assertNotNull(menu);
    }
}