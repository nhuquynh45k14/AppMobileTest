package page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PassDataPage {
    public static Target TXT_VALUE = Target.the("textbox enter value")
            .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/edit_text']"));
    public static Target BTN_ADD = Target.the("btn add")
            .located(By.xpath("//*[@text='Pass Data']"));

    public static Target LBL_TEXT = Target.the("lbl text")
            .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/text']"));

}

