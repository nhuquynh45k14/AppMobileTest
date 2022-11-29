package task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import page.AddRemovePage;

public class Remove {
    public static Performable by(String item) {
        return Task.where("Remove item",
                Enter.theValue(item).into(AddRemovePage.TXT_VALUE),
                Click.on(AddRemovePage.BTN_REMOVE));
    }
}
