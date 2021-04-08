package co.com.choucair.certificacion.utest.tasks;

import co.com.choucair.certificacion.utest.userinterface.uTestSearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {
    private String strCourse;

    public Search(String strCourse) {

        this.strCourse = strCourse;
    }


    public static Search the(String strCourse) {

        return Tasks.instrumented(Search.class, strCourse);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestSearchCoursePage.BUTTON_AU),
                Enter.theValue(strCourse).into(uTestSearchCoursePage.INPUT_COURSE),
                Click.on(uTestSearchCoursePage.BUTTON_GO),
                Click.on(uTestSearchCoursePage.SELECT_COURSE)
        );
    }
}