package dk.mercantec.javaii;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class MenuTest {

    @Test
    public void testAdd() throws Exception {
        Menu menu = new Menu();
        boolean addSuccess = menu.Add("Test", new MenuCallback() {
            public void Invoke() {
                System.exit(0);
            }
        });
        assertTrue(addSuccess);
    }
}