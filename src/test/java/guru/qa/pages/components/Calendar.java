package guru.qa.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class Calendar {
    public void setDate(String  year, String month, String day) {
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOptionByValue(year);
        $(".react-datepicker__day--0" + day +
                ":not(.react-datepicker__day--outside-month)").click();
    }
}
