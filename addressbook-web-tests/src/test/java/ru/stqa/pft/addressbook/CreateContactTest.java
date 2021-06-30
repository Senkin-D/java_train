package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class CreateContactTest extends TestBase{

    @Test
    public void testCreateContact() {
        addNewUser();
        fillNewUserForm(new NewUserData("John", "Smith", "Guru", "Admin2", "Intermedia", "7777777777", "Home", "1@1.com"));
        submitNewUser();
        goToHomepage();
    }

}
