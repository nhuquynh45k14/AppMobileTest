package page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MovePage {
    public static Target BTN_TO_UP = Target.the("img example")
            .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/to_up']"));
}
