package question;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.TheLocation;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class Location implements Performable {
    private final Target target;
    private int num;

    public Location(Target target,int num) {
        this.target = target;
        this.num =num;
    }
  public static Performable to(Target target, int i) {
        return Tasks.instrumented(Location.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Dimension screenDimension = target.resolveFor(actor).getSize();
        Point elementPoint = actor.asksFor(TheLocation.of(target));
        if (num == 2) {
            Click.on(String.valueOf((screenDimension.getHeight() / 5) * num));
        }
        if (num == 3) {
            Click.on(String.valueOf((screenDimension.getHeight() / 5) * num));
        }
//        } else if ((elementPoint.getX() <= screenDimension.getWidth() / 2) && (elementPoint.getY() >= screenDimension.getHeight() / 2)) {
//            return Position.TOP_RIGHT;
//        } else if ((elementPoint.getX() >= screenDimension.getWidth() / 2) && (elementPoint.getY() <= screenDimension.getHeight() / 2)) {
//            return Position.BOTTOM_LEFT;
//        } else if ((elementPoint.getX() <= screenDimension.getWidth() / 2) && (elementPoint.getY() <= screenDimension.getHeight() / 2)) {
//            return Position.TOP_LEFT;
//        }
    }
}
