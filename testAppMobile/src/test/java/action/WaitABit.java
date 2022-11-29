package action;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitABit implements Performable {
    private final int seconds;

    public WaitABit(int seconds) {
        this.seconds = seconds;
    }

    @Step("{0} waits a bit in #seconds seconds")
    public static Performable inSeconds(int seconds) {
        return instrumented(WaitABit.class, seconds * 1000);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
