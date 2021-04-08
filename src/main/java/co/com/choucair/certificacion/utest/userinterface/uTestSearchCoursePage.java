package co.com.choucair.certificacion.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class uTestSearchCoursePage extends PageObject {
    public static final Target BUTTON_AU = Target.the("Selecciona la universidad choucair").located(By.xpath("//div[@class='nav-sidebar-item__link nav-sidebar-item__link--selected']//strong]"));
    public static final Target INPUT_COURSE = Target.the("Busca el curso").located(By.id("searchInput"));
    public static final Target BUTTON_GO = Target.the("Dale click para buscar el curso").located(By.xpath("//span[contains(@class,'ntux-nav-header-search__icon'"));
    public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso").located(By.xpath("//h2[contains(@text(),'1. Introduction to uTest')]"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso").located(By.xpath("//h1[contains(@text(),'Welcome to uTest')]"));
}
