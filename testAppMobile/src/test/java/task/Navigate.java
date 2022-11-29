package task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import page.HomePage;

public class Navigate {
    public static Performable toAddRemovePage() {
        return Task.where("navigate to the Add/Remove Page",
                actor -> {
                    actor.attemptsTo(
                            Click.on(HomePage.LBL_ITEM("Code Examples")),
                            Click.on(HomePage.LBL_ITEM("Containers")),
                            Click.on(HomePage.LBL_ITEM("Add / Remove items from GridView")));
                }
        );
    }

    public static Performable toZoomPage() {
        return Task.where("navigate to ZoomPage",
                actor -> {
                    actor.attemptsTo(
                            Click.on(HomePage.LBL_ITEM("Code Examples")),
                            Click.on(HomePage.LBL_ITEM("Animations")),
                            Click.on(HomePage.LBL_ITEM("Zoom")));
                }
        );
    }

    public static Performable toMovePage() {
        return Task.where("navigate to ZoomPage",
                actor -> {
                    actor.attemptsTo(
                            Click.on(HomePage.LBL_ITEM("Code Examples")),
                            Click.on(HomePage.LBL_ITEM("Animations")),
                            Click.on(HomePage.LBL_ITEM("Move")));
                }
        );
    }
    public static Performable toPassDataPage() {
        return Task.where("navigate to ZoomPage",
                actor -> {
                    actor.attemptsTo(
                            Click.on(HomePage.LBL_ITEM("Code Examples")),
                            Click.on(HomePage.LBL_ITEM("Activity")),
                            Click.on(HomePage.LBL_ITEM("Pass data to other Activity")));
                }
        );
    }
    public static Performable toAddRemoveListPage() {
        return Task.where("navigate to the Add/Remove Page",
                actor -> {
                    actor.attemptsTo(
                            Click.on(HomePage.LBL_ITEM("Code Examples")),
                            Click.on(HomePage.LBL_ITEM("Containers")),
                            Click.on(HomePage.LBL_ITEM("Add remove items from ListView")));
                }
        );
    }
}
