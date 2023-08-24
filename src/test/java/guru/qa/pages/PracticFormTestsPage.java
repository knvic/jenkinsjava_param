package guru.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import guru.qa.pages.components.CalendarComponent;
import guru.qa.pages.components.ResultTableComponent;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticFormTestsPage {

    CalendarComponent calendar = new CalendarComponent();
    ResultTableComponent resultTableComponent=new ResultTableComponent();
    SelenideElement
            firstName = $("#firstName"),
            lastName = $("#lastName"),
            userEmail = $("#userEmail"),
            userNumber = $("#userNumber"),
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
            modalDialog = $(".modal-dialog"),
            checkTitle = $("#example-modal-sizes-title-lg");



    public PracticFormTestsPage openPage() {
               open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public PracticFormTestsPage setFirstName(String value) {
        firstName.setValue(value);
        return this;
    }

    public PracticFormTestsPage setLastName(String value) {
        lastName.setValue(value);
        return this;
    }

    public PracticFormTestsPage setUserEmail(String value) {
        userEmail.setValue(value);
        return this;
    }

    public PracticFormTestsPage setGender(String value) {
        gender.$(byText(value)).click();
        return this;
    }

        public PracticFormTestsPage setUserNumber(String value) {
        userNumber.setValue(value);
        return this;
    }

    public PracticFormTestsPage setBirth(String year, String month, String day) {
        birthDate.click();
        calendar.setDate(year, month, day);
        return this;
    }

    public PracticFormTestsPage setSubjects(String value) {
        subjects.setValue(value).pressEnter();
        return this;
    }

    public PracticFormTestsPage setHobbies(String value) {
        hobbies.$(byText(value)).click();
        return this;
    }

    public PracticFormTestsPage uploadPicture(String filename) {
        uploadPic.uploadFromClasspath(filename);
        return this;
    }

    public PracticFormTestsPage setCurrentAddress(String value) {
        currentAddress.setValue(value);
        return this;
    }

    public PracticFormTestsPage deleteBannerAndFooter() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public PracticFormTestsPage setStateAndCity(String state, String city) {
        clickState.click();
        stateCity.$(byText(state)).click();
        clickCity.click();
        stateCity.$(byText(city)).click();
        return this;
    }

    public PracticFormTestsPage submit() {
        submit.click();
        return this;
    }

    public PracticFormTestsPage checkModalDialogeTitle(String value) {
        modalDialog.should(Condition.appear);
        checkTitle.shouldHave(text(value));
        return this;
    }


    public PracticFormTestsPage checkResult(List<String> list) {
        for (String item : list) {
            resultTableComponent.checkResult(item);
        }

        return this;
    }

}
