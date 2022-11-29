package page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static Target ICON_MENU = Target.the("icon menu")
            .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/upmenubutton']" +
                    "| //*[@resource-id='com.apk_devops_apk_dev_free:id/menucancal']"));

    public static Target LBL_ITEM(String item) {
        return Target.the("")
                .locatedBy("//*[@text='" + item + "']");
    }
}
