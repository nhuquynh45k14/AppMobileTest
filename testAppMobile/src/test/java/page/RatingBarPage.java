package page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RatingBarPage {
    public static Target BTN_RATINGBAR = Target.the("lbl text")
            .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/ratingbar']"));

    public static Target LBL_TEXT = Target.the("lbl text")
            .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/thetext']"));
}
