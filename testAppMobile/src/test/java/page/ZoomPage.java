package page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ZoomPage {
    public static Target BTN_ZOOM_IN = Target.the("btn zoom in")
            .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/zoom_in']"));
    public static Target BTN_ZOOM_OUT = Target.the("btn zoom out")
            .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/zoom_out']"));

    public static Target IMG_EXAMPLE = Target.the("img example")
            .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/object']"));

}
