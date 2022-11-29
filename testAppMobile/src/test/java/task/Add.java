package task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import page.AddRemoveListViewPage;
import page.AddRemovePage;

public class Add {
    public static Performable by(String item) {
        return Task.where("Add item",
                Enter.theValue(item).into(AddRemovePage.TXT_VALUE),
                Click.on(AddRemovePage.BTN_ADD));
    }
    public static Performable by2(String title) {
        return Task.where("Add title",
                Enter.theValue(title).into(AddRemoveListViewPage.TXT_TITLE),
                Click.on(AddRemoveListViewPage.BTN_ADD));
    }
}
