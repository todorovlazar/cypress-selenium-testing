package com.example.seleniumteststelekom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RegisterTelekomPage {

    public SelenideElement firstname = $x("//*[@class=\"panel-body\"]/div/div/form/fieldset/div[1]/div[1]/input");
    public SelenideElement lastname = $x("//*[@class=\"panel-body\"]/div/div/form/fieldset/div[1]/div[2]/input");
    public SelenideElement email = $x("//*[@class=\"panel-body\"]/div/div/form/fieldset/input[1]");
    public SelenideElement labelEmail = $x("//*[@class=\"panel-body\"]/div/div/form/fieldset/label[1]");
    public SelenideElement password = $x("//*[@class=\"panel-body\"]/div/div/form/fieldset/input[2]");
    public SelenideElement passwordLabel = $x("//*[@class=\"panel-body\"]/div/div/form/fieldset/label[2]");
    public SelenideElement confirmPassword = $x("//*[@class=\"panel-body\"]/div/div/form/fieldset/input[3]");
    public SelenideElement registrirajSeButton = $x("//*[@class=\"panel-body\"]/div/div/form/fieldset/div[5]/button");
    public SelenideElement zastitaNaPodatociLink = $x("//*[@class=\"panel-body\"]/div/div/form/fieldset/div[5]/p/a");
    public SelenideElement najaviSeLink = $x("//*[@class=\"panel-body\"]/div/div/form/fieldset/div[5]/a");
}
