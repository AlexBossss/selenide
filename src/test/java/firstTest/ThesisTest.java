package firstTest;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class ThesisTest {
    @Test
    void shouldSearch() {
        open("http://localhost:8080/app/#!");

        Initialization.initialization("admin", "admin");
        new User().createSimpleUser("testUser2", "1");

        new Task().createTask()
                .startTaskManagementProcess("testUser1")
                .addExecutor("testUser2");


    }
}
