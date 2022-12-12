package question;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class Swipe implements Performable {

    public static Swipe down() {
        return Tasks.instrumented(Swipe.class);
    }
    @Override
    public <T extends Actor> void performAs(T t) {
        WebDriverFacade facade = (WebDriverFacade) BrowseTheWeb.as(t).getDriver();
        AndroidDriver androidDriver = (AndroidDriver) facade.getProxiedDriver();
        Dimension dimension = androidDriver.manage().window().getSize();
        Point start = new Point((int) (dimension.width * 0.1), (int) (dimension.height * 0.9));
        Point end = new Point((int) (dimension.width * 0.2), (int) (dimension.height * 0.2));
        Actions.doSwipe(androidDriver, start, end, 1000);  //with duration 1s

    }
}