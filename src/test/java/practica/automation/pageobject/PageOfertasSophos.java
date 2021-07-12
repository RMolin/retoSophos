package practica.automation.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import practica.automation.dto.Oferta;

import java.util.ArrayList;
import java.util.List;

public class PageOfertasSophos  extends PageObject {

    @FindBy(xpath = "//div[@class='premium-blog-content-wrapper empty-thumb']/div/div/h3/a")
    List<WebElement> lblNombreOferta;
    @FindBy(xpath = "//div[@class='premium-blog-content-wrapper empty-thumb']/div/div/div/span/span")
    List<WebElement> lblFechaOferta;
    @FindBy(xpath = "//div[@class='premium-blog-content-wrapper empty-thumb']/div[2]")
    List<WebElement> lblDetalleOferta;

    public List<String> obtenerOfertas(){
        List<String> ofertas = new ArrayList();
        for(int i = 0 ; i < lblNombreOferta.size() ; i++ ){
            Oferta o = new Oferta(i+1
                    , lblNombreOferta.get(i).getText()
                    , lblFechaOferta.get(i).getText()
                    , lblDetalleOferta.get(i).getText());
            System.out.println(o.toString());
            System.out.println("-----------------------------------------------------");
            ofertas.add(o.toString());

        }
        return ofertas;
    }

}
