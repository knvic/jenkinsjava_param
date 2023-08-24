package guru.qa.tests;

import guru.qa.pages.TextBoxTestsPage;
import org.junit.jupiter.api.Test;

public class TextBoxTestsWithPageObject extends BaseTest{


    TextBoxTestsPage textBoxTestsPage =new TextBoxTestsPage();

    @Test
    void extBoxTestsWithPageObject() {

      /* Ввода данных*/
        textBoxTestsPage
                .openPage()
                .setuserName("Alex Egorov")
                .setuserEmail("alex@egorov.com")
                .setAddress("Some address 1")
                .setpermanentAddress("Another address 1")
                .submit();

        /* Проверка результата*/
        textBoxTestsPage
                .outputname("Alex Egorov")
                .outputemail("alex@egorov.com")
                .outputcurrentAddress("Some address 1")
                .outputermanentAddress("Another address 1");
    }


}
