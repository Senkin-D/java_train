package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.UserData;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
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

    public void clickEditContact() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
    }

    public void submitUpdatedUser() {
        click(By.name("update"));
    }

    public void selectUser() {
        click(By.name("selected[]"));
    }

    public void deleteSelectedUser() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void clickDeleteContact() {
        click(By.xpath("//div[@id='content']/form[2]/input[2]"));
    }
}
