package question;


import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.Point;

public class Location implements Performable {
    private final Target target;

    public Location(Target target, int num) {
        this.target = target;
        this.num = num;
    }

    private final int num;


//        this.num = num;

    //    public static Location ofElement(Target target) {
//        return new Location;
//    }
    public static Location of(Target target, int num) {
        return Tasks.instrumented(Location.class, target, num);
    }

//    @Override
//    public Void answeredBy(Actor actor) {
//        Dimension screenDimension = target.resolveFor(actor).getSize();
//        Click.on(String.valueOf(((screenDimension.getHeight() / 5) * num)));
//
//        return null;
//    }

    @Override
    public <T extends Actor> void performAs(T t) {
        WebDriverFacade facade = (WebDriverFacade) BrowseTheWeb.as(t).getDriver();
        AndroidDriver androidDriver = (AndroidDriver) facade.getProxiedDriver();

        int targetPoint = target.resolveFor(t).getSize().getWidth();
        int xOffset =  (targetPoint/5*(num+1));
        Actions.doTap(androidDriver, new Point(xOffset, 802), 200); //with duration 200ms

//        System.out.println("targetPoint" + targetPoint);
    }
}

