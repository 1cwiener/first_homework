package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class PracticeFormTest {

    @Test
    void dataAppearsInOutBlockText() {
        open("https://demoqa.com/automation-practice-form");
        $(".main-header").shouldHave(text("Practice Form"));
        $("#firstName").setValue("Nikolay");
        $("#lastName").setValue("Pribolovets");
        $("#userEmail").setValue("fake@mail.com");
        $("#gender-radio-1").doubleClick();
        $("#userNumber").setValue("333013666");
        //Выбрать дату из календаря
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(byText("December")).click();
        $(".react-datepicker__year-select").click();
        $(byText("1989")).click();

        //$$(byText("30")).get(1).click();
        $(".react-datepicker__month").$$(byText("30")).get(1).click();
        $("#hobbiesWrapper").find(byText("Sports")).click();
        $("#hobbiesWrapper").find(byText("Music")).click();
        sleep(10000);



        //$("#subjectsContainer").setValue("Просто текс сабжа");
        //$("#hobbies-checkbox-1").click();
        //$("#hobbies-checkbox-3").click();

        //Прикрепить файл
        //uploadPicture
        //Ввести адресс
        //currentAddress
        //Выбрать штат из дроп-дауна
        //state
        //Выбрать город из дроп-дауна
        //city
        //Отправить инфу
        //submit
        //Проверить правильность отображения данных
    }
}
