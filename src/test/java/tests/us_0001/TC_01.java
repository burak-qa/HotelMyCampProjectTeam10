package tests.us_0001;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import utilities.Driver;
import utilities.ReusableMethods;


public class TC_01 {

//TC_01-Kullanıcı,  Home, Rooms, Restaurant, AboutBlog, Contact, ve Log in  butonlarini  tiklayabilmeli
    @Test
    public void test() {
        HMCPage hmcPage=new HMCPage();
        SoftAssert softAssert=new SoftAssert();
        //1-kullanici url'e gider
        hmcPage.anasayfaGiris();
        //2-Kullanici home butonuna tiklar
        //Kullanici home sayfasina yönlendirilmelidir
        hmcPage.mainPageHomeButton.click();
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Hotelmycamp - Home";
        softAssert.assertEquals(actualTitle,expectedTitle,"Home button is not working");
        //3-Kullanici rooms butonuna tiklar
        //Kullanicinin rooms sayfasina yönlendirilmelidir
        hmcPage.mainPageRoomsButton.click();
        boolean isRoomsPage=Driver.getDriver().getCurrentUrl().contains("rooms");
        softAssert.assertTrue(isRoomsPage,"Rooms button is not working");
        Driver.getDriver().navigate().back();
        //4-Kullanici restaurant butonuna tiklar
        //Kullanicinin restaurant sayfasina yönlendirilmelidir
        hmcPage.mainPageRestaurantButton.click();
        boolean isRestaurantPage=Driver.getDriver().getCurrentUrl().contains("restaurant");
        softAssert.assertTrue(isRestaurantPage,"Restaurant button is not working");
        Driver.getDriver().navigate().back();
        //5-Kullanici aboutBlog butonuna tiklar
        //Kullanicinin about blog sayfasina yönlendirilmelidir
        hmcPage.mainPageAboutButton.click();
        boolean isAboutPage=Driver.getDriver().getCurrentUrl().contains("about");
        softAssert.assertTrue(isAboutPage,"About button is not working");
        Driver.getDriver().navigate().back();
        //6-Kullanici blogs butonuna tiklar
        //Kullanicinin blogs sayfasina yönlendirilmelidir
        hmcPage.mainPageBlogButton.click();
        boolean isBlogPage=Driver.getDriver().getCurrentUrl().contains("blog");
        softAssert.assertTrue(isBlogPage,"Blog button is not working");
        Driver.getDriver().navigate().back();
        //7-Kullanici contact butonuna tiklar
        //Kullanicinin contact sayfasina yönlendirilmelidir
        hmcPage.mainPageContactButton.click();
        boolean isContactPage=Driver.getDriver().getCurrentUrl().contains("contact");
        softAssert.assertTrue(isContactPage,"Contact button is not working");
        Driver.getDriver().navigate().back();
        //8-Kullanici login butonuna tiklar
        //Kullanicinin login sayfasina yönlendirilmelidir
        hmcPage.ilkLoginLinki.click();
        boolean isLoginPage=hmcPage.loginPageLoginTextWebElement.isDisplayed();
        softAssert.assertTrue(isLoginPage,"Login button is not working");

        softAssert.assertAll();
        Driver.closeDriver();
    }
}
