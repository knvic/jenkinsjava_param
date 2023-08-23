package guru.qa.tests;

import com.codeborne.selenide.SelenideElement;
import guru.qa.pages.PracticFormPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class PracticFormWihhPageObject extends BaseTest{
    PracticFormPage practicFormPage =new PracticFormPage();

    @Test
    void name() {
        practicFormPage.openPage()
                .setFirstName("firstName")
                .setLastName("lastName")
                .setUserEmail("aaa@bbb.cc")
                .setUserNumber("1234567890")
                .setGender("Female")
                .setGenderMale().setBirth("2022","July","27") ;



    }
}
