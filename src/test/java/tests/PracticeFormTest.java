package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest {

    @Test
    void dataAppearsInOutBlockText() {
        //Открытие и проверка сайта
        open("https://demoqa.com/automation-practice-form");
        $(".main-header").shouldHave(text("Practice Form"));
        //Ввод имени и фамилии
        $("#firstName").setValue("Nikolay");
        $("#lastName").setValue("Pribolovets");
        //Ввод почты
        $("#userEmail").setValue("fake@mail.com");
        //Выбор пола
        $("#gender-radio-1").doubleClick();
        //Ввод номера телефона
        $("#userNumber").setValue("333013666");
        //Выбор даты рождения
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(byText("December")).click();
        $(".react-datepicker__year-select").click();
        $(byText("1989")).click();
        $(".react-datepicker__month").$$(byText("30")).get(1).click();
        //Выбор предметов
        $("#subjectsInput").setValue("Mat");
        $("#subjectsInput").pressEnter();
        $("#subjectsInput").setValue("Phy");
        $("#subjectsInput").pressEnter();

        //Выбор хобби
        $("#hobbiesWrapper").find(byText("Sports")).click();
        $("#hobbiesWrapper").find(byText("Music")).click();

        //Прикрепить файл
        $("#uploadPicture").setValue("C:\\Users\\nikol\\Pictures\\Saved Pictures\\Cat.jfif");

        //Ввести адресс
        //Выбрать штат из дроп-дауна
        //Выбрать город из дроп-дауна
        //Отправить инфу
        //Проверить правильность отображения данных
        sleep(10000);
    }
}
