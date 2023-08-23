package guru.qa.pages;

import com.codeborne.selenide.SelenideElement;
import guru.qa.pages.components.Calendar;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticFormPage {

Calendar calendar = new Calendar();
    SelenideElement
            firstName = $("#firstName"),
            lastName = $("#lastName"),
            userEmail = $("#userEmail"),
            userNumber = $("#userNumber"),
            genderMale = $("#gender-radio-1"),
            gender = $("#genterWrapper"),
            birthDate = $("#dateOfBirthInput");


    public PracticFormPage openPage(){
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public PracticFormPage setFirstName(String value){
        firstName.setValue(value);
        return this;
    }

    public PracticFormPage setLastName(String value) {
        lastName.setValue(value);

        return this;
    }

    public PracticFormPage setUserEmail(String value) {
        userEmail.setValue(value);

        return this;
    }

    public PracticFormPage setGender(String value) {
        gender.$(byText(value)).click();

        return this;
    }
    public PracticFormPage setGenderMale() {
        genderMale.parent().click();

        return this;
    }


    public PracticFormPage setUserNumber(String value) {
        userNumber.setValue(value);

        return this;
    }

    public PracticFormPage setBirth(String year, String month, String day) {
        birthDate.click();
        calendar.setDate(year, month,day );

        return this;
    }

    public PracticFormPage checkResult(String value) {
        $(".table-responsive").shouldHave(text(value));

        return this;
    }

}
