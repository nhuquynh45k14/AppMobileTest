package task;

import action.WaitABit;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import page.HomePage;
import page.SearchInAppPage;

public class Search {
    public static Performable by(String keyword) {
        return Task.where("search",
                Click.on(HomePage.LBL_ITEM("Search in app")),
                Enter.theValue(keyword).into(SearchInAppPage.TXT_KEYWORD),
                WaitABit.inSeconds(2),
                Click.on(SearchInAppPage.LBL_ITEM(keyword)));
    }
}
