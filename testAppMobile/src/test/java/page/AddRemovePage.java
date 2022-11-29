package page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddRemovePage {
    public static Target TXT_VALUE = Target.the("textbox enter value")
            .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/editText1']"));

    public static Target BTN_ADD = Target.the("btn add")
            .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/button1']"));
    public static Target BTN_REMOVE = Target.the("btn add")
            .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/button2']"));

    public static Target LBL_ITEM(String item) {
        return Target.the("lbl item")
                .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/gridView1']//*[@text='" + item + "']"));
    }
    public static Target LBL_POPUP = Target.the("btn add")
            .located(By.xpath("//*[@class='android.widget.Toast']"));

//    public static Target LBL_POPUP(String item) {
//        return Target.the("lbl popup")
//                .located(By.xpath("//*[@text='" + item + "clicked']"));
//    }
}
