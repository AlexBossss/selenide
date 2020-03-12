package firstTest;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Initialization {



    public static void initialization(String user, String password){
        //login
        $(byXpath("//*[@id=\"app-96801\"]/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]/input")).setValue(user);
        //password
        $(byXpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[2]/td[3]/input")).setValue(password);
        //войти
        $(byXpath("//*[@id=\"app-96801\"]/div/div[2]/div/div/div/div/div[3]/div")).click();
    }
}
