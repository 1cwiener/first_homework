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
        $("#userNumber").setValue("0333013666");
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
        //Закрыть рекламу
        $("#close-fixedban").click();
        //Проскролить страницу
        $("#submit").hover();
        //Прикрепить файл
        $("#uploadPicture").setValue("C:\\Users\\nikol\\Pictures\\Saved Pictures\\Cat.jfif");
        //Ввести адресс
        $("#currentAddress").setValue("Minsk, Belarus");
        //Выбрать штат из дроп-дауна
        $("#state").click();
        $("#state").$(byText("NCR")).click();
        //Выбрать город из дроп-дауна
        $("#city").click();
        $("#city").$(byText("Noida")).click();
        //Отправить инфу
        $("#submit").click();
        //Проверить правильность отображения данных
        $(".table-responsive").shouldHave(text("Nikolay"), text("Pribolovets"),
                text("fake@mail.com"), text("Male"), text("0333013666"), text("30 December,1989"), text("Maths, Physics"),
                text("Cat.jfif"), text("Minsk, Belarus"), text("NCR Noida"), text("Sports, Music"));
    }
}
