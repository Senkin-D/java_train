package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }

    public void goByHomepageLink() {
        click(By.linkText("home page"));
    }
    public void goByHomeLink() {
        click(By.linkText("home"));
    }

    public void submitAlert(){
        wd.switchTo().alert().accept();
    }

}
