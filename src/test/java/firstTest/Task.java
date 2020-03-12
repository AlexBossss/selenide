package firstTest;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;

public class Task {
    int count = 3;
    public Task createTask() {
        element(byXpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div/div[3]/div/span[1]")).click();
        element(byXpath("/html/body/div[3]/div[2]/div/div/span[1]")).click();
        element(byXpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/div/div/div[2]/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div[3]/div/div[3]/input")).setValue("Hello");
        element(byXpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/div/div/div[2]/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div/div[3]")).click();
        return this;
    }

    public Task startTaskManagementProcess(String executor) {
        //отправить исполнителю
        element(byXpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div/div[5]/div")).click();
        //исполнитель
        element(byXpath("/html/body/div[3]/div[3]/div/div/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[3]/div/div/div/div[1]/input")).setValue(executor).pressEnter();
        return this;
    }

    public Task addExecutor(String executor) {
        //добавить участника
        element(byXpath("/html/body/div[3]/div[3]/div/div/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div/div[3]/div/div/div[1]/div/div[1]/div/div/div/div[1]/div/div")).click();
        //исполнитель
        element(byXpath("/html/body/div[3]/div[4]/div/div[2]/table/tbody/tr[2]/td")).click();
        //исполнитель 1
        element(byXpath("/html/body/div[3]/div[3]/div/div/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div/div[3]/div/div/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr["+count+++"]/td[3]/div/div/div/div[1]/input")).setValue(executor).pressEnter();
        element(byXpath("/html/body/div[3]/div[3]/div/div/div[3]/div/div/div/div[3]/div/div/div/div/div/div[1]/div")).click();
        return this;
    }

    public Task start(){

        return this;
    }
}
