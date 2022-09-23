package com.example.seleniumteststelekom;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class RegisterTelekomPageTest {

    RegisterTelekomPage registerTelekomPage = new RegisterTelekomPage();

    @BeforeEach
    public void setUp() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://id.telekom.mk/MyT/Register?application=34&returnUrl=%2fissue%2foidc%2fauthorize%3fresponse_type%3dcode%26scope%3dopenid%2520profile%2520email%2520msisdn%2520mytmobile%2520mytelecom%26client_id%3dmyt2%26state%3d123%26redirect_uri%3dhttps%3a%2f%2fmojtelekom.mk%2fauth%2fcallback");
    }

    @AfterEach
    public void tearDown(){
        closeWebDriver();
    }

    //region test for checking if inputs, labels, links and button exist

    @Test
    public void itemsExist() throws InterruptedException {
        Thread.sleep(1000);
        registerTelekomPage.firstname.exists();
        registerTelekomPage.firstname.shouldBe(Condition.visible);
        registerTelekomPage.firstname.shouldHave(Condition.attribute("placeholder", "Име"));
        registerTelekomPage.firstname.shouldHave(Condition.attribute("type", "text"));
        registerTelekomPage.firstname.shouldHave(Condition.attribute("name", "FirstName"));
        Thread.sleep(1000);
        registerTelekomPage.lastname.exists();
        registerTelekomPage.lastname.shouldBe(Condition.visible);
        registerTelekomPage.lastname.shouldHave(Condition.attribute("placeholder", "Презиме"));
        registerTelekomPage.lastname.shouldHave(Condition.attribute("type", "text"));
        registerTelekomPage.lastname.shouldHave(Condition.attribute("name", "LastName"));
        Thread.sleep(1000);
        registerTelekomPage.email.exists();
        registerTelekomPage.email.shouldBe(Condition.visible);
        registerTelekomPage.email.shouldHave(Condition.attribute("placeholder", "Внесете е-адреса"));
        registerTelekomPage.email.shouldHave(Condition.attribute("type", "text"));
        registerTelekomPage.email.shouldHave(Condition.attribute("name", "Email"));
        registerTelekomPage.labelEmail.exists();
        registerTelekomPage.labelEmail.shouldBe(Condition.visible);
        registerTelekomPage.labelEmail.innerHtml().equals("Е-адреса");
        Thread.sleep(1000);
        registerTelekomPage.password.exists();
        registerTelekomPage.password.shouldBe(Condition.visible);
        registerTelekomPage.password.shouldHave(Condition.attribute("placeholder", "Внесете лозинка"));
        registerTelekomPage.password.shouldHave(Condition.attribute("type", "password"));
        registerTelekomPage.password.shouldHave(Condition.attribute("name", "NewPassword"));
        registerTelekomPage.passwordLabel.exists();
        registerTelekomPage.passwordLabel.shouldBe(Condition.visible);
        registerTelekomPage.passwordLabel.innerHtml().equals("Лозинка");
        registerTelekomPage.confirmPassword.exists();
        registerTelekomPage.confirmPassword.shouldBe(Condition.visible);
        registerTelekomPage.confirmPassword.shouldHave(Condition.attribute("placeholder", "Потврдете лозинка"));
        registerTelekomPage.confirmPassword.shouldHave(Condition.attribute("type", "password"));
        registerTelekomPage.confirmPassword.shouldHave(Condition.attribute("name", "ConfirmNewPassword"));
        Thread.sleep(1000);
        registerTelekomPage.registrirajSeButton.exists();
        registerTelekomPage.registrirajSeButton.shouldBe(Condition.visible);
        registerTelekomPage.zastitaNaPodatociLink.exists();
        registerTelekomPage.zastitaNaPodatociLink.shouldBe(Condition.visible);
        registerTelekomPage.zastitaNaPodatociLink.shouldHave(Condition.attribute("href", "http://www.telekom.mk/content/pdf/Informacija-za-zastita-na-licni-podatoci.pdf"));
        registerTelekomPage.najaviSeLink.exists();
        registerTelekomPage.najaviSeLink.shouldBe(Condition.visible);
        registerTelekomPage.najaviSeLink.shouldHave(Condition.attribute("href", "https://moj.telekom.mk/"));
    }

    //endregion

    //region tests for registering

    @Test
    public void registerOnlyWithFirstname() throws InterruptedException {
        Thread.sleep(1000);
        String firstname = "lazar";
        String finalUrl = "https://id.telekom.mk/MyT/RegisterSso";
        registerTelekomPage.firstname.shouldBe(Condition.visible);
        registerTelekomPage.firstname.sendKeys(firstname);
        registerTelekomPage.registrirajSeButton.shouldBe(Condition.visible);
        registerTelekomPage.registrirajSeButton.click();
        String currentUrl = webdriver().driver().getCurrentFrameUrl();
        Assertions.assertEquals(currentUrl, finalUrl);
        Thread.sleep(1000);
    }

    @Test
    public void registerOnlyWithLastname() throws InterruptedException {
        Thread.sleep(1000);
        String lastname = "todorov";
        String finalUrl = "https://id.telekom.mk/MyT/RegisterSso";
        registerTelekomPage.lastname.shouldBe(Condition.visible);
        registerTelekomPage.lastname.sendKeys(lastname);
        registerTelekomPage.registrirajSeButton.shouldBe(Condition.visible);
        registerTelekomPage.registrirajSeButton.click();
        String currentUrl = webdriver().driver().getCurrentFrameUrl();
        Assertions.assertEquals(currentUrl, finalUrl);
        Thread.sleep(1000);
    }

    @Test
    public void registerOnlyWithEmail() throws InterruptedException {
        Thread.sleep(1000);
        String email = "lazar@test.com";
        String finalUrl = "https://id.telekom.mk/MyT/RegisterSso";
        registerTelekomPage.email.shouldBe(Condition.visible);
        registerTelekomPage.email.sendKeys(email);
        registerTelekomPage.labelEmail.shouldBe(Condition.visible);
        registerTelekomPage.registrirajSeButton.shouldBe(Condition.visible);
        registerTelekomPage.registrirajSeButton.click();
        String currentUrl = webdriver().driver().getCurrentFrameUrl();
        Assertions.assertEquals(currentUrl, finalUrl);
        Thread.sleep(1000);
    }

    @Test
    public void registerOnlyWithPassword() throws InterruptedException {
        Thread.sleep(1000);
        String password = "lazar_test_password";
        String finalUrl = "https://id.telekom.mk/MyT/RegisterSso";
        registerTelekomPage.password.shouldBe(Condition.visible);
        registerTelekomPage.password.sendKeys(password);
        registerTelekomPage.passwordLabel.shouldBe(Condition.visible);
        registerTelekomPage.registrirajSeButton.shouldBe(Condition.visible);
        registerTelekomPage.registrirajSeButton.click();
        String currentUrl = webdriver().driver().getCurrentFrameUrl();
        Assertions.assertEquals(currentUrl, finalUrl);
        Thread.sleep(1000);
    }

    @Test
    public void registerOnlyWithConfirmPassword() throws InterruptedException {
        Thread.sleep(1000);
        String confirmPassword = "lazar_test_password";
        String finalUrl = "https://id.telekom.mk/MyT/RegisterSso";
        registerTelekomPage.confirmPassword.shouldBe(Condition.visible);
        registerTelekomPage.confirmPassword.sendKeys(confirmPassword);
        registerTelekomPage.registrirajSeButton.shouldBe(Condition.visible);
        registerTelekomPage.registrirajSeButton.click();
        String currentUrl = webdriver().driver().getCurrentFrameUrl();
        Assertions.assertEquals(currentUrl, finalUrl);
        Thread.sleep(1000);
    }

    @Test
    public void registerWithNothing() throws InterruptedException {
        Thread.sleep(1000);
        String finalUrl = "https://id.telekom.mk/MyT/RegisterSso";
        registerTelekomPage.registrirajSeButton.shouldBe(Condition.visible);
        registerTelekomPage.registrirajSeButton.click();
        String currentUrl = webdriver().driver().getCurrentFrameUrl();
        Assertions.assertEquals(currentUrl, finalUrl);
        Thread.sleep(1000);
    }

    @Test
    public void registerWithEverything_WrongEmailFormat() throws InterruptedException {
        Thread.sleep(1000);
        String finalUrl = "https://id.telekom.mk/MyT/RegisterSso";
        String firstName = "lazar"; String lastName = "todorov";
        String email = "lazetodorov21";
        String password = "LaZaR!123*85"; String confirmPassword = "LaZaR!123*85";
        registerTelekomPage.firstname.shouldBe(Condition.visible);
        registerTelekomPage.firstname.sendKeys(firstName);
        registerTelekomPage.lastname.shouldBe(Condition.visible);
        registerTelekomPage.lastname.sendKeys(lastName);
        registerTelekomPage.email.shouldBe(Condition.visible);
        registerTelekomPage.email.sendKeys(email);
        registerTelekomPage.password.shouldBe(Condition.visible);
        registerTelekomPage.password.sendKeys(password);
        registerTelekomPage.confirmPassword.shouldBe(Condition.visible);
        registerTelekomPage.confirmPassword.sendKeys(confirmPassword);
        registerTelekomPage.registrirajSeButton.shouldBe(Condition.visible);
        registerTelekomPage.registrirajSeButton.click();
        String currentUrl = webdriver().driver().getCurrentFrameUrl();
        Assertions.assertEquals(currentUrl, finalUrl);
        Thread.sleep(1000);
    }

    @Test
    public void registerWithEverything_WrongPasswordCombinaton() throws InterruptedException {
        Thread.sleep(1000);
        String finalUrl = "https://id.telekom.mk/MyT/RegisterSso";
        String firstName = "lazar"; String lastName = "todorov";
        String email = "lazetodorov21@gmail.com";
        String password = "l"; String confirmPassword = "l";
        registerTelekomPage.firstname.shouldBe(Condition.visible);
        registerTelekomPage.firstname.sendKeys(firstName);
        registerTelekomPage.lastname.shouldBe(Condition.visible);
        registerTelekomPage.lastname.sendKeys(lastName);
        registerTelekomPage.email.shouldBe(Condition.visible);
        registerTelekomPage.email.sendKeys(email);
        registerTelekomPage.password.shouldBe(Condition.visible);
        registerTelekomPage.password.sendKeys(password);
        registerTelekomPage.confirmPassword.shouldBe(Condition.visible);
        registerTelekomPage.confirmPassword.sendKeys(confirmPassword);
        registerTelekomPage.registrirajSeButton.shouldBe(Condition.visible);
        registerTelekomPage.registrirajSeButton.click();
        String currentUrl = webdriver().driver().getCurrentFrameUrl();
        Assertions.assertEquals(currentUrl, finalUrl);
        Thread.sleep(1000);
    }

    @Test
    public void registerWithEverything_WrongConfirmPassword() throws InterruptedException {
        Thread.sleep(1000);
        String finalUrl = "https://id.telekom.mk/MyT/RegisterSso";
        String firstName = "lazar"; String lastName = "todorov";
        String email = "lazetodorov21@test.com";
        String password = "LaZaR!123*85"; String confirmPassword = "lazar!123*85";
        registerTelekomPage.firstname.shouldBe(Condition.visible);
        registerTelekomPage.firstname.sendKeys(firstName);
        registerTelekomPage.lastname.shouldBe(Condition.visible);
        registerTelekomPage.lastname.sendKeys(lastName);
        registerTelekomPage.email.shouldBe(Condition.visible);
        registerTelekomPage.email.sendKeys(email);
        registerTelekomPage.password.shouldBe(Condition.visible);
        registerTelekomPage.password.sendKeys(password);
        registerTelekomPage.confirmPassword.shouldBe(Condition.visible);
        registerTelekomPage.confirmPassword.sendKeys(confirmPassword);
        registerTelekomPage.registrirajSeButton.shouldBe(Condition.visible);
        registerTelekomPage.registrirajSeButton.click();
        String currentUrl = webdriver().driver().getCurrentFrameUrl();
        Assertions.assertEquals(currentUrl, finalUrl);
        Thread.sleep(1000);
    }

    @Test
    public void registerWithEverything_Success() throws InterruptedException {
        Thread.sleep(1000);
        String finalUrl = "https://id.telekom.mk/MyT/UserCreated?application=34&returnUrl=%2Fissue%2Foidc%2Fauthorize%3Fresponse_type%3Dcode%26scope%3Dopenid%2520profile%2520email%2520msisdn%2520mytmobile%2520mytelecom%26client_id%3Dmyt2%26state%3D123%26redirect_uri%3Dhttps%3A%2F%2Fmojtelekom.mk%2Fauth%2Fcallback&userName=lazetodorov21%40testtest.com";
        String firstName = "lazar"; String lastName = "todorov";
        String email = "lazetodorov21@testtest.com";
        String password = "LaZaR!123*85"; String confirmPassword = "LaZaR!123*85";
        registerTelekomPage.firstname.shouldBe(Condition.visible);
        registerTelekomPage.firstname.sendKeys(firstName);
        registerTelekomPage.lastname.shouldBe(Condition.visible);
        registerTelekomPage.lastname.sendKeys(lastName);
        registerTelekomPage.email.shouldBe(Condition.visible);
        registerTelekomPage.email.sendKeys(email);
        registerTelekomPage.password.shouldBe(Condition.visible);
        registerTelekomPage.password.sendKeys(password);
        registerTelekomPage.confirmPassword.shouldBe(Condition.visible);
        registerTelekomPage.confirmPassword.sendKeys(confirmPassword);
        registerTelekomPage.registrirajSeButton.shouldBe(Condition.visible);
        registerTelekomPage.registrirajSeButton.click();
        String currentUrl = webdriver().driver().getCurrentFrameUrl();
        Assertions.assertEquals(currentUrl, finalUrl);
        Thread.sleep(1000);
    }

    //endregion
}
