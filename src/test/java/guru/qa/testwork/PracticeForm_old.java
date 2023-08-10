package guru.qa.testwork;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeForm_old {

    @BeforeAll
    public static void setUpAll() {

        Configuration.browserSize = "1920x1800";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
        open("https://demoqa.com/automation-practice-form");
    }

    @AfterEach
    void afterEach() {
        sleep(300);
    }
    @AfterAll
    public static void afterAll() {
        $("#submit").click();
        $(".modal-dialog").should(Condition.appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("firstName"),text("lastName"),text("aaa@bbb.cc"));



    }

  /*  @BeforeEach
    public void setUp() {
        open("https://demoqa.com/automation-practice-form");
    }*/

    @Test
    void txtForm() {

        $("#firstName").setValue("firstName");
        $("#lastName").setValue("lastName");
        $("#userEmail").setValue("aaa@bbb.cc");
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

        $(".react-datepicker__day--027:not(react-datepicker__day--outside-month)") .click();

    }
    @Test
    void subjects() {
        $("#subjectsInput").setValue("Chemistry").pressEnter();
    }
    @Test
    void hobbies() {
        $("#hobbiesWrapper").$(byText("Reading")).click();
    }

    @Test
    void selectPicture() {

       File picture = new File("src/test/resources/img/picture.png");
       $("#uploadPicture").uploadFile(picture);
       sleep(2000);
    }
    @Test
    void selectPictureFromClassPath() {
        $("#uploadPicture").uploadFromClasspath("img/picture1.png");
        sleep(2000);
    }

    @Test
    void  currentAddress() {
        $("#currentAddress").setValue("Russia");
    }

    @Test
    void removwFutherJavaScript() {
        sleep(2000);
        executeJavaScript("$('footer').remove()");
    }

    @Test
    void stateAndCity() {
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Uttar Pradesh")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Agra")).click();
    }

    @Test
    void sity() {
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Agra")).click();
    }


}
