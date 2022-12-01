package page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchInAppPage {
    public static Target TXT_KEYWORD = Target.the("txt keyword")
            .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/search_view']"));

    public static Target LBL_ITEM(String item) {
        return Target.the("lbl item")
                .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/list']//*[@text='" + item + "']"));
    }
    }
