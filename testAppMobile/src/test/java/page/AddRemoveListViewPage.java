package page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddRemoveListViewPage {
    public static Target BTN_ADD = Target.the("btn add")
            .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/button']"));

    public static Target TXT_TITLE = Target.the("btn add")
            .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/title']"));

    public static Target LBL_TITLE(String title) {
        return Target.the("lbl item")
                .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/list']//*[@text='" + title + "']"));
    }
}
