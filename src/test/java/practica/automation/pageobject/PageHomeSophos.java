package practica.automation.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.sophossolutions.com/")
public class PageHomeSophos extends PageObject {

    @FindBy(xpath = "//div[@id='sg-popup-content-wrapper-5998']")
    WebElement popUpOferta;

    @FindBy(xpath = "//li[@id='mega-menu-item-1541']/a")
    WebElement btnTrabajaConNosotros;

    @WhenPageOpens
    public void waitUntilTitleAppears() {
        element(btnTrabajaConNosotros).waitUntilVisible();
    }

    public void validarHome() {
        if (popUpOferta.isDisplayed()) {
            getDriver().switchTo().activeElement().sendKeys(Keys.ESCAPE);
        }
    }

    public void irAVerOfertas() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        btnTrabajaConNosotros.click();
    }
}
