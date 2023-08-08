package guru.qa.l2;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeForm {

    @BeforeAll
    public static void setUpAll() {

        Configuration.browserSize = "1920x1800";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
    }

    @BeforeEach
    public void setUp() {
        open("https://demoqa.com/automation-practice-form");
    }

    @Test
    void txtForm() {

        $("#firstName").setValue("firstName");
        $("#lastName").setValue("lastName");
        $("#userEmail").setValue("userEmail");
        $("#userNumber").setValue("1234567890");



    }
    @Test
    void causeGender1() {

        $("#gender-radio-1").parent().click();

    }
    @Test
    void causeGender2() {

           $("[for=gender-radio-2]").click();
    }
    @Test
    void causeGender3() {

                $("label[for=gender-radio-3]").click();
    }
    @Test
    void causeGenderTxt() {

        $("#genterWrapper").$(byText("Female")).click();
    }
    @Test
    void  dateOfBirthInput() {

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOptionByValue("2022");

        $(".react-datepicker__day react-datepicker__day--022").click();

    }

}
