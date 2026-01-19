package tests;

import org.testng.annotations.Test;
import pages.adminPages;
import utilities.ConfigReader;
import utilities.Driver;

public class US01 {

    adminPages adminPages = new adminPages();
    @Test
    public void US01(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        adminPages.signInButton.click();
        System.out.println("merhaba 167");
        System.out.println("asdasd");
        System.out.println("son hali");
    }
}
