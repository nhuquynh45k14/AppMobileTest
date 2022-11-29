package task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import page.PassDataPage;

public class PassData {
    public static Performable by(String text) {
        return Task.where("pass data",
                Enter.theValue(text).into(PassDataPage.TXT_VALUE),
                Click.on(PassDataPage.BTN_ADD));
    }
}
