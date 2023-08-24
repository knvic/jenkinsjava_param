package guru.qa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTestsPage {


    SelenideElement
            userName = $("#userName"),
            userEmail = $("#userEmail"),
            adress = $("#currentAddress"),
            permanentAddress = $("#permanentAddress"),
            submit = $("#submit"),
            outputname = $("#output #name"),
            outputemail = $("#output #email"),
            outputcurrentAddress = $("#output #currentAddress"),
            outputermanentAddress = $("#output #permanentAddress");




    public TextBoxTestsPage openPage() {
        open("/text-box");
        return this;
    }

    public TextBoxTestsPage setuserName(String value) {
        userName.setValue(value);
        return this;
    }

    public TextBoxTestsPage setuserEmail(String value) {
        userEmail.setValue(value);
        return this;
    }

    public TextBoxTestsPage setAddress(String value) {
        adress.setValue(value);
        return this;
    }

    public TextBoxTestsPage setpermanentAddress(String value) {
        permanentAddress.setValue(value);
        return this;
    }

    public TextBoxTestsPage submit() {
        submit.click();
        return this;
    }

    public TextBoxTestsPage outputname(String value) {
        outputname.shouldHave(text(value));
        return this;
    }

    public TextBoxTestsPage outputemail(String value) {
        outputemail.shouldHave(text(value));
        return this;
    }

    public TextBoxTestsPage outputcurrentAddress(String value) {
        outputcurrentAddress.shouldHave(text(value));
        return this;
    }

    public TextBoxTestsPage outputermanentAddress(String value) {
        outputermanentAddress.shouldHave(text(value));
        return this;
    }


}

