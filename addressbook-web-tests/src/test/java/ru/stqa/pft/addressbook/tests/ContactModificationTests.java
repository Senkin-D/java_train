package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.UserData;


public class ContactModificationTests extends TestBase{
    @Test
    public void testContactModification(){
        app.getContactHelper().selectContact();
        app.getContactHelper().fillUserForm(new UserData("Adam", "Smith", "Guru", "Admin2", "Intermedia", "7777777777", "Home", "1@1.com"));
        app.getContactHelper().submitUpdatedUser();
        app.getNavigationHelper().goByHomeLink();

    }
}
