package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.UserData;

public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void fillUserForm(UserData userData) {
        type(By.name("firstname"), userData.getFirstname());
        type(By.name("lastname"), userData.getLastname());
        type(By.name("nickname"), userData.getNickname());
        type(By.name("title"), userData.getTitle());
        type(By.name("company"), userData.getCompany());
        type(By.name("mobile"), userData.getMobile());
        type(By.name("address"), userData.getAddress());
        type(By.name("email"), userData.getEmail());

    }

    public void submitNewUser() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void addNewUser() {
        click(By.linkText("add new"));
    }

    public void selectContact() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[4]/td[8]/a/img"));
    }

    public void submitUpdatedUser() {
        click(By.name("update"));
    }
}
