package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.NewUserData;

public class CreateContactTest extends TestBase {

    @Test
    public void testCreateContact() {
        app.getContactHelper().addNewUser();
        app.getContactHelper().fillNewUserForm(new NewUserData("John", "Smith", "Guru", "Admin2", "Intermedia", "7777777777", "Home", "1@1.com"));
        app.getContactHelper().submitNewUser();
        app.getNavigationHelper().goToHomepage();
    }

}
