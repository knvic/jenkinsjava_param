package guru.qa.pages;

import com.codeborne.selenide.Condition;
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
            birthDate = $("#dateOfBirthInput"),
            subjects = $("#subjectsInput"),
            hobbies = $("#hobbiesWrapper"),
            uploadPic = $("#uploadPicture"),
            currentAddress = $("#currentAddress"),
            clickState = $("#state"),
            stateCity = $("#stateCity-wrapper"),
            clickCity = $("#city"),
            submit = $("#submit"),
            modaldialog = $(".modal-dialog"),
            CheckTitle = $("#example-modal-sizes-title-lg"),
            checkInputData = $(".table-responsive");


    public PracticFormPage openPage() {
        //open("https://demoqa.com/automation-practice-form");
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public PracticFormPage setFirstName(String value) {
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
        calendar.setDate(year, month, day);
        return this;
    }

    public PracticFormPage setSubjects(String value) {
        subjects.setValue(value).pressEnter();
        return this;
    }

    public PracticFormPage setHobbies(String value) {
        hobbies.$(byText(value)).click();
        return this;
    }

    public PracticFormPage uploadPicture(String filename) {
        uploadPic.uploadFromClasspath(filename);
        return this;
    }

    public PracticFormPage setCurrentAddress(String value) {
        currentAddress.setValue(value);
        return this;
    }

    public PracticFormPage deletefooer() {
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public PracticFormPage setStateAndCity(String state, String city) {
        clickState.click();
        stateCity.$(byText(state)).click();
        clickCity.click();
        stateCity.$(byText(city)).click();
        return this;
    }

    public PracticFormPage submit() {
        submit.click();
        return this;
    }

    public PracticFormPage checkModalDialogeTitle(String value) {
        modaldialog.should(Condition.appear);
        CheckTitle.shouldHave(text(value));
        return this;
    }
    public PracticFormPage checkResult(String firstName,String lastName,String mail,String tel,String gen,String date,String f,String hob,String upload,String addr,String stateCity) {
        checkInputData.shouldHave(text(firstName), text(lastName), text(mail), text(tel),
                text(gen), text(date), text(f), text(hob), text(upload), text(addr), text(stateCity));

        return this;
    }

}
