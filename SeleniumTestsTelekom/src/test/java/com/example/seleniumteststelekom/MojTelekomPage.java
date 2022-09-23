package com.example.seleniumteststelekom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MojTelekomPage {

    public SelenideElement usernameInput = $x("//*[@class=\"panel-body\"]/div/div/form/fieldset/input[1]");
    public SelenideElement usernameLabel = $x("//*[@class=\"panel-body\"]/div/div/form/fieldset/label[1]");
    public SelenideElement passwordInput = $x("//*[@class=\"panel-body\"]/div/div/form/fieldset/input[2]");
    public SelenideElement passwordLabel = $x("//*[@class=\"panel-body\"]/div/div/form/fieldset/label[2]");

    public SelenideElement najaviButton = $x("//*[@class=\"panel-body\"]/div/div/form/fieldset/div[3]/button");

    public SelenideElement zaboraviLozinkaLink = $x("//*[@class=\"panel-body\"]/div/div/form/fieldset/a");
    public SelenideElement zaboraviLozinkaInnerHtml = $x("//*[@class=\"panel-body\"]/div/div/form/fieldset/a/small");

    public SelenideElement registrirajSeLink = $x("//*[@class=\"panel-body\"]/div/div/form/fieldset/div[3]/p/a");

}
