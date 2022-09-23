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

public class ForgotPasswordTelekomPageTest {

    ForgotPasswordTelekomPage forgotPasswordTelekomPage = new ForgotPasswordTelekomPage();

    @BeforeEach
    public void setUp() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://id.telekom.mk/MyT/ForgotPassword?application=34&returnUrl=%2fissue%2foidc%2fauthorize%3fresponse_type%3dcode%26scope%3dopenid%2520profile%2520email%2520msisdn%2520mytmobile%2520mytelecom%26client_id%3dmyt2%26state%3d123%26redirect_uri%3dhttps%3a%2f%2fmojtelekom.mk%2fauth%2fcallback");
    }

    @AfterEach
    public void tearDown(){
        closeWebDriver();
    }

    //region tests

    @Test
    public void itemsExist() throws InterruptedException {
        Thread.sleep(1000);
        forgotPasswordTelekomPage.ispratiInput.exists();
        forgotPasswordTelekomPage.ispratiInput.shouldBe(Condition.visible);
        forgotPasswordTelekomPage.ispratiInput.shouldHave(Condition.attribute("placeholder", "Внесете е-адреса"));
        forgotPasswordTelekomPage.ispratiInput.shouldHave(Condition.attribute("type", "text"));
        forgotPasswordTelekomPage.ispratiInput.shouldHave(Condition.attribute("name", "UserName"));
        forgotPasswordTelekomPage.ispsratiButton.exists();
        forgotPasswordTelekomPage.ispsratiButton.shouldBe(Condition.visible);
        forgotPasswordTelekomPage.ispsratiButton.shouldHave(Condition.attribute("name", "singlebutton"));
    }

    @Test
    public void sendRequest_InvalidEmailFormat() throws InterruptedException {
        Thread.sleep(1000);
        String username = "lazar";
        String expectedFinalUrl = "https://id.telekom.mk/MyT/ForgotPassword?application=34&returnUrl=%2fissue%2foidc%2fauthorize%3fresponse_type%3dcode%26scope%3dopenid%2520profile%2520email%2520msisdn%2520mytmobile%2520mytelecom%26client_id%3dmyt2%26state%3d123%26redirect_uri%3dhttps%3a%2f%2fmojtelekom.mk%2fauth%2fcallback";
        forgotPasswordTelekomPage.ispratiInput.shouldBe(Condition.visible);
        forgotPasswordTelekomPage.ispratiInput.sendKeys(username);
        forgotPasswordTelekomPage.ispsratiButton.shouldBe(Condition.visible);
        forgotPasswordTelekomPage.ispsratiButton.click();
        String currentUrl = webdriver().driver().getCurrentFrameUrl();
        Assertions.assertEquals(currentUrl, expectedFinalUrl);
        Thread.sleep(1000);
    }

    @Test
    public void sendRequest_InvalidEmailNotExisting() throws InterruptedException {
        Thread.sleep(1000);
        String username = "lazar@test.com";
        String expectedFinalUrl = "https://id.telekom.mk/MyT/ForgotPassword?application=34&returnUrl=%2fissue%2foidc%2fauthorize%3fresponse_type%3dcode%26scope%3dopenid%2520profile%2520email%2520msisdn%2520mytmobile%2520mytelecom%26client_id%3dmyt2%26state%3d123%26redirect_uri%3dhttps%3a%2f%2fmojtelekom.mk%2fauth%2fcallback";
        forgotPasswordTelekomPage.ispratiInput.shouldBe(Condition.visible);
        forgotPasswordTelekomPage.ispratiInput.sendKeys(username);
        forgotPasswordTelekomPage.ispsratiButton.shouldBe(Condition.visible);
        forgotPasswordTelekomPage.ispsratiButton.click();
        String currentUrl = webdriver().driver().getCurrentFrameUrl();
        Assertions.assertEquals(currentUrl, expectedFinalUrl);
        Thread.sleep(1000);
    }

    @Test
    public void sendRequest_ValidEmail_Success() throws InterruptedException {
        Thread.sleep(1000);
        String username = "lazetodorov21@testtest.com";
        String expectedFinalUrl = "https://id.telekom.mk/MyT/ForgotPassword?application=34&returnUrl=%2fissue%2foidc%2fauthorize%3fresponse_type%3dcode%26scope%3dopenid%2520profile%2520email%2520msisdn%2520mytmobile%2520mytelecom%26client_id%3dmyt2%26state%3d123%26redirect_uri%3dhttps%3a%2f%2fmojtelekom.mk%2fauth%2fcallback";
        forgotPasswordTelekomPage.ispratiInput.shouldBe(Condition.visible);
        forgotPasswordTelekomPage.ispratiInput.sendKeys(username);
        forgotPasswordTelekomPage.ispsratiButton.shouldBe(Condition.visible);
        forgotPasswordTelekomPage.ispsratiButton.click();
        String currentUrl = webdriver().driver().getCurrentFrameUrl();
        Assertions.assertEquals(currentUrl, expectedFinalUrl);
        Thread.sleep(1000);
    }

    //endregion
}
