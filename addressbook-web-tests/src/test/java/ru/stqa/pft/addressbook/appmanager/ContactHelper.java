package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.NewUserData;

public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void fillNewUserForm(NewUserData newUserData) {
        type(By.name("firstname"), newUserData.getFirstname());
        type(By.name("lastname"), newUserData.getLastname());
        type(By.name("nickname"), newUserData.getNickname());
        type(By.name("title"), newUserData.getTitle());
        type(By.name("company"), newUserData.getCompany());
        type(By.name("mobile"), newUserData.getMobile());
        type(By.name("address"), newUserData.getAddress());
        type(By.name("email"), newUserData.getEmail());

    }

    public void submitNewUser() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void addNewUser() {
        click(By.linkText("add new"));
    }
}
