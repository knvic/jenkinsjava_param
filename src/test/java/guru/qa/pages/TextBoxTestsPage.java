package guru.qa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTestsPage {


    SelenideElement
            userName = $("#userName"),
            userEmail = $("#userEmail"),
            address = $("#currentAddress"),
            permanentAddress = $("#permanentAddress"),
            submit = $("#submit"),
            outputName = $("#output #name"),
            outputEmail = $("#output #email"),
            outputCurrentAddress = $("#output #currentAddress"),
            outputPermanentAddress = $("#output #permanentAddress");




    public TextBoxTestsPage openPage() {
        open("/text-box");
        return this;
    }

    public TextBoxTestsPage setUserName(String value) {
        userName.setValue(value);
        return this;
    }

    public TextBoxTestsPage setUserEmail(String value) {
        userEmail.setValue(value);
        return this;
    }

    public TextBoxTestsPage setAddress(String value) {
        address.setValue(value);
        return this;
    }

    public TextBoxTestsPage setPermanentAddress(String value) {
        permanentAddress.setValue(value);
        return this;
    }

    public TextBoxTestsPage submit() {
        submit.click();
        return this;
    }

    public TextBoxTestsPage outputName(String value) {
        outputName.shouldHave(text(value));
        return this;
    }

    public TextBoxTestsPage outputEmail(String value) {
        outputEmail.shouldHave(text(value));
        return this;
    }

    public TextBoxTestsPage outputCurrentAddress(String value) {
        outputCurrentAddress.shouldHave(text(value));
        return this;
    }

    public TextBoxTestsPage outputPermanentAddress(String value) {
        outputPermanentAddress.shouldHave(text(value));
        return this;
    }


}

