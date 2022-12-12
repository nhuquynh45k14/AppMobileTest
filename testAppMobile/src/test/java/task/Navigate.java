package task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;
import page.HomePage;
import question.Swipe;

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
    public static Performable by(Target target) {
        return Task.where("navigate by " + target,
                actor -> {
                    while (Visibility.of(target).answeredBy(actor).equals(false)){
                        actor.attemptsTo(Swipe.down());
                    }
                    actor.attemptsTo(Click.on(target));
                }
        );
    }
}
