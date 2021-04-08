package co.com.choucair.certificacion.utest.questions;

import co.com.choucair.certificacion.utest.userinterface.uTestSearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(uTestSearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        if (question.equals(nameCourse)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
