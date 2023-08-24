package guru.qa.tests;


import guru.qa.pages.TextBoxTestsPage;
import org.junit.jupiter.api.Test;

public class TextBoxWithPageObjectTests extends BaseTest{


    TextBoxTestsPage textBoxTestsPage =new TextBoxTestsPage();

    @Test
    void extBoxTestsWithPageObject() {

      /* Ввода данных*/
        textBoxTestsPage
                .openPage()
                .setUserName("Alex Egorov")
                .setUserEmail("alex@egorov.com")
                .setAddress("Some address 1")
                .setPermanentAddress("Another address 1")
                .submit();

        /* Проверка результата*/
        textBoxTestsPage
                .outputName("Alex Egorov")
                .outputEmail("alex@egorov.com")
                .outputCurrentAddress("Some address 1")
                .outputPermanentAddress("Another address 1");
    }


}
