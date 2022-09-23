package com.example.seleniumteststelekom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ForgotPasswordTelekomPage {

    public SelenideElement ispratiInput = $x("//*[@class=\"panel-body\"]/div/div/div/div/form/fieldset/input");
    public SelenideElement ispsratiButton = $x("//*[@class=\"panel-body\"]/div/div/div/div/form/fieldset/div[2]/button");
}
