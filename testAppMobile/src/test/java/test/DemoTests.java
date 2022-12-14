package test;

import action.WaitABit;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import page.*;
import question.Location;
import task.Add;
import task.Navigate;
import task.PassData;
import task.Remove;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

@ExtendWith(SerenityJUnit5Extension.class)
public class DemoTests {
    @CastMember(name = "Tester")
    public Actor actor;

    @Test
    public void test1() {
        givenThat(actor).attemptsTo(
                Navigate.toAddRemovePage()
        );
        when(actor).attemptsTo(
                Add.by("Singapore")
        );
        then(actor).attemptsTo(
                WaitABit.inSeconds(10),
                Ensure.that(AddRemovePage.LBL_ITEM("Singapore")).isDisplayed()
        );
    }

    @Test
    public void test2() {
        givenThat(actor).attemptsTo(
                Navigate.toAddRemovePage()
        );
        when(actor).attemptsTo(
                Remove.by("Germany")
        );
        then(actor).attemptsTo(
                WaitABit.inSeconds(10),
                Ensure.that(AddRemovePage.LBL_ITEM("Germany")).isNotDisplayed()
        );
    }

    @Test
    public void test3() {
        givenThat(actor).attemptsTo(
                Navigate.toAddRemovePage()
        );
        when(actor).attemptsTo(
                Click.on(HomePage.LBL_ITEM("Turkey"))
        );
        then(actor).attemptsTo(
                Ensure.that(AddRemovePage.LBL_POPUP).hasText("Turkey Clicked")
        );
    }

    @Test
    public void test4() {
        givenThat(actor).attemptsTo(
                Navigate.toPassDataPage()
        );
        when(actor).attemptsTo(
                PassData.by("activity")
        );
        then(actor).should(
                seeThat(the(PassDataPage.LBL_TEXT), containsText("activity")));
    }


    @Test
    public void test5() {
        givenThat(actor).attemptsTo(
                Navigate.toAddRemoveListPage()
        );
        when(actor).attemptsTo(
                Add.by2("Quynh")
        );
        then(actor).attemptsTo(
                Ensure.that(AddRemoveListViewPage.LBL_TITLE("Quynh")).isDisplayed()
        );
        when(actor).attemptsTo(
                Click.on(AddRemoveListViewPage.LBL_TITLE("Quynh"))
        );
        then(actor).attemptsTo(
                Ensure.that(AddRemoveListViewPage.LBL_TITLE("Quynh")).isNotDisplayed()
        );
    }

//    @Test
//    public void test6() {
//        givenThat(actor).attemptsTo(
//                Click.on(HomePage.ICON_MENU)
//        );
//        when(actor).attemptsTo(
//                Search.by("RatingBar"),
//                WaitABit.inSeconds(2)
//        );
//        when(actor).attemptsTo(
//                Location.of()
//        );
//        System.out.println("size" + (RatingBarPage.BTN_RATINGBAR.resolveFor(actor).getSize()));

//        then(actor).should(
//                seeThat(the(RatingBarPage.LBL_TEXT), containsText("Need a little bit improvement")));
//    }

    @Test
    public void test6_2() {
        givenThat(actor).attemptsTo(
                Click.on(HomePage.LBL_ITEM("Code Examples"))
        );
        when(actor).attemptsTo(
                Navigate.by(HomePage.LBL_ITEM("UI Elements")),
                Navigate.by(HomePage.LBL_ITEM("RatingBar"))
        );
        when(actor).attemptsTo(
                Location.of(RatingBarPage.BTN_RATINGBAR, 2),
                WaitABit.inSeconds(5)
        );
        then(actor).should(
                seeThat(the(RatingBarPage.LBL_TEXT), containsText("Need a litle bit improvement")));

//        when(actor).attemptsTo(
//                Click.on(HomePage.LBL_ITEM("UI Elements"))
//        );
//        System.out.println("size" + (RatingBarPage.BTN_RATINGBAR.resolveFor(actor).getSize()));

//        then(actor).should(
//                seeThat(the(RatingBarPage.LBL_TEXT), containsText("Need a little bit improvement")));

    }
}
