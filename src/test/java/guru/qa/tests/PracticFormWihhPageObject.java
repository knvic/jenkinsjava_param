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
                .setGenderMale().setBirth("2022","July","27")
                .setSubjects("Chemistry")
                .setHobbies("Reading")
                .uploadPicture("img/picture.png")
                .setCurrentAddress("Russia")
                .deletefooer()
                .setStateAndCity("Uttar Pradesh","Agra")
                .submit()
                .checkModalDialogeTitle("Thanks for submitting the form")
                .checkResult("firstName","lastName",
                        "aaa@bbb.cc","1234567890","Male",
                        "27 July,2022","Chemistry","Reading",
                        "picture.png","Russia",
                        "Uttar Pradesh Agra");



    }
}
