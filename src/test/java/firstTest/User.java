package firstTest;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;

public class User {
    private static final String EMAIL = "perminov@haulmont.com";

    public  User createSimpleUser(String userName, String password) {
        element(byXpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div/div[3]/div/span[8]")).click();//администрирование
        //пользователи
        element(byXpath("/html/body/div[3]/div[2]/div/div/span[1]/span[1]")).click();
        //создать
        element(byXpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/div/div/div[2]/div/div/div/div/div/div[3]/div/div[1]/div/div[1]/div/div[1]")).click();
        //нового
        element(byXpath("/html/body/div[3]/div[2]/div/div/div[1]")).click();
        //логин
        element(byXpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/input")).setValue(userName);
        //пароль
        element(byXpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[2]/div/div[3]/input")).setValue(password);
        //парольХ2
        element(byXpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[2]/div/div[4]/input")).setValue(password);
        //Умайл
        element(byXpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[2]/div/div[9]/input")).setValue(EMAIL);
        //группа
        element(byXpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[3]/div/div[2]/div[2]/div/div")).click();
        //Огр доступ
        element(byXpath("/html/body/div[3]/div[3]/div/div/div[3]/div/div/div/div[1]/div/div/div/div/div[1]/div/div[2]/div[4]/div[1]")).doubleClick();
        //Ок
        element(byXpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[5]/div/div/div/div[1]/div")).click();
        return this;
    }

    public void exit(){
        element(byXpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div/div[11]/div/div[2]/div")).click();
        element(byXpath("/html/body/div[3]/div[3]/div/div/div[3]/div/div/div[3]/div/div/div/div[1]")).click();
    }
}
