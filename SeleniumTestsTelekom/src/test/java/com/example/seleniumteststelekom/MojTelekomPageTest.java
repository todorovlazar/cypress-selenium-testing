package com.example.seleniumteststelekom;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class MojTelekomPageTest {

    MojTelekomPage mojTelekomPage = new MojTelekomPage();

    @BeforeEach
    public void setUp() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://id.telekom.mk/myt/signin?ReturnUrl=%2fissue%2foidc%2fauthorize%3fresponse_type%3dcode%26scope%3dopenid%2520profile%2520email%2520msisdn%2520mytmobile%2520mytelecom%26client_id%3dmyt2%26state%3d123%26redirect_uri%3dhttps%3a%2f%2fmojtelekom.mk%2fauth%2fcallback");
    }

    @AfterEach
    public void tearDown(){
        closeWebDriver();
    }


    //region test for checking if the inputs and labels exist

    @Test
    public void inputAndLabelsExist() throws InterruptedException {
        Thread.sleep(1000);
        mojTelekomPage.usernameLabel.exists();
        mojTelekomPage.usernameLabel.shouldBe(Condition.visible);
        mojTelekomPage.usernameLabel.innerHtml().equals("Корисничко име (е-адреса)");
        Thread.sleep(1000);
        mojTelekomPage.usernameInput.exists();
        mojTelekomPage.usernameInput.shouldBe(Condition.visible);
        mojTelekomPage.usernameInput.shouldHave(Condition.attribute("placeholder", "Внесете е-адреса"));
        mojTelekomPage.usernameInput.shouldHave(Condition.attribute("type", "text"));
        Thread.sleep(1000);
        mojTelekomPage.passwordLabel.exists();
        mojTelekomPage.passwordLabel.shouldBe(Condition.visible);
        mojTelekomPage.passwordLabel.innerHtml().equals("Лозинка");
        Thread.sleep(1000);
        mojTelekomPage.passwordInput.exists();
        mojTelekomPage.passwordInput.shouldBe(Condition.visible);
        mojTelekomPage.passwordInput.shouldHave(Condition.attribute("placeholder", "Внесете лозинка"));
        mojTelekomPage.passwordInput.shouldHave(Condition.attribute("type", "password"));
        Thread.sleep(1000);
        mojTelekomPage.najaviButton.shouldBe(Condition.visible);
        mojTelekomPage.najaviButton.innerHtml().equals("Најави ме");
    }

    @Test
    public void enteredUsernameOnlyLogin() throws InterruptedException {
        Thread.sleep(1000);
        String username = "lazar.lazar@test.com";
        mojTelekomPage.usernameInput.sendKeys(username);
        Thread.sleep(1000);
        mojTelekomPage.najaviButton.click();
    }

    @Test
    public void enteredPasswordOnlyLogin() throws InterruptedException {
        Thread.sleep(1000);
        String password = "something_something_test";
        mojTelekomPage.passwordInput.sendKeys(password);
        Thread.sleep(1000);
        mojTelekomPage.najaviButton.click();
    }

    @Test
    public void enteredUsernameAndPasswordLogin() throws InterruptedException {
        Thread.sleep(1000);
        String username = "lazar.lazar@test.com";
        String password = "something_something_test";
        mojTelekomPage.usernameInput.sendKeys(username);
        mojTelekomPage.passwordInput.sendKeys(password);
        Thread.sleep(1000);
        mojTelekomPage.najaviButton.click();
    }

    //endregion

    //region test for checking if the links exist

    @Test
    public void linksExist() throws InterruptedException {
        Thread.sleep(1000);
        mojTelekomPage.zaboraviLozinkaLink.exists();
        mojTelekomPage.zaboraviLozinkaLink.shouldBe(Condition.visible);
        mojTelekomPage.zaboraviLozinkaLink.shouldHave(Condition.attribute("href", "https://id.telekom.mk/MyT/ForgotPassword?application=34&returnUrl=%2fissue%2foidc%2fauthorize%3fresponse_type%3dcode%26scope%3dopenid%2520profile%2520email%2520msisdn%2520mytmobile%2520mytelecom%26client_id%3dmyt2%26state%3d123%26redirect_uri%3dhttps%3a%2f%2fmojtelekom.mk%2fauth%2fcallback"));
        mojTelekomPage.zaboraviLozinkaInnerHtml.exists();
        mojTelekomPage.zaboraviLozinkaInnerHtml.shouldBe(Condition.visible);
        mojTelekomPage.zaboraviLozinkaInnerHtml.innerHtml().equals("Ја заборавивте лозинката?");
        Thread.sleep(1000);
        mojTelekomPage.registrirajSeLink.exists();
        mojTelekomPage.registrirajSeLink.shouldBe(Condition.visible);
        mojTelekomPage.registrirajSeLink.shouldHave(Condition.attribute("href", "https://id.telekom.mk/MyT/Register?application=34&returnUrl=%2fissue%2foidc%2fauthorize%3fresponse_type%3dcode%26scope%3dopenid%2520profile%2520email%2520msisdn%2520mytmobile%2520mytelecom%26client_id%3dmyt2%26state%3d123%26redirect_uri%3dhttps%3a%2f%2fmojtelekom.mk%2fauth%2fcallback"));
        mojTelekomPage.registrirajSeLink.innerHtml().equals("Регистрирајте се");
    }

    @Test
    public void zaboraviLozinkaLinkClick() throws InterruptedException {
        Thread.sleep(1000);
        mojTelekomPage.zaboraviLozinkaLink.shouldBe(Condition.visible);
        mojTelekomPage.zaboraviLozinkaLink.click();
        Thread.sleep(1000);
    }

    @Test
    public void registrirajSeLinkClick() throws InterruptedException {
        Thread.sleep(1000);
        mojTelekomPage.registrirajSeLink.shouldBe(Condition.visible);
        mojTelekomPage.registrirajSeLink.click();
        Thread.sleep(1000);
    }


    //endregion
}
