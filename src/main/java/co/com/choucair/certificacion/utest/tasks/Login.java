package co.com.choucair.certificacion.utest.tasks;

import co.com.choucair.certificacion.utest.userinterface.uTestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login  implements Task {

    private String strUser;
    private String  strPassword;

    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }
    public static Login onThePage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class, strUser, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestLoginPage.LOGIN_BUTTON),
                Enter.theValue(strUser).into(uTestLoginPage.INPUT_USER),
                Enter.theValue(strPassword).into(uTestLoginPage.INPUT_PASSWORD),
                Click.on(uTestLoginPage.ENTER_BUTTON)


        );
    }
}

