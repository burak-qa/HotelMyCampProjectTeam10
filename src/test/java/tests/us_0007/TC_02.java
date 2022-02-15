package tests.us_0007;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_02 {

    /*

      **Step1
      **Kullanıcı url yi girer */


    @Test
    public void test01(){
        HMCPage hmcPage =new HMCPage();
        SoftAssert softAssert=new SoftAssert();
        hmcPage.anasayfaGiris();
    }

    /* Step 2
      **Geçerli bilgilerle Log-in yapılır
     */
    @Test
    public void test02(){
        HMCPage hmcPage =new HMCPage();
        SoftAssert softAssert=new SoftAssert();
        hmcPage.girisYap();
    }

}