package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{
    @Test
    public void testDeleteContactFromList(){
        app.getContactHelper().selectUser();
        app.getContactHelper().deleteSelectedUser();
        app.getNavigationHelper().submitAlert();
        app.getNavigationHelper().goByHomeLink();
    }

    @Test
    public void testDeleteContactFromSettings(){
        app.getContactHelper().clickEditContact();
        app.getContactHelper().clickDeleteContact();
        app.getNavigationHelper().goByHomeLink();

    }
}
