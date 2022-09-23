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

public class TelekomIndexPageTest {

    TelekomIndexPage telekomIndexPage = new TelekomIndexPage();

    @BeforeEach
    public void setUp() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://www.telekom.mk/privatni-korisnici.nspx");
    }

    @AfterEach
    public void tearDown(){
        closeWebDriver();
    }

    //region tests for right-side-content class
    @Test
    public void kupiPripejdButton() throws InterruptedException {
        telekomIndexPage.samoNeophodniButton.click();
        Thread.sleep(2000);
        telekomIndexPage.kupiPripejdBrojButton.click();
        Thread.sleep(2000);
        telekomIndexPage.kupiPripejdBrojButton.shouldBe(Condition.visible);
        telekomIndexPage.kupiPripejdBrojButton.hover();
        Thread.sleep(2000);
        telekomIndexPage.kupiPripejdBrojButton.shouldHave(Condition.attribute("title", "Купи припејд број"));
        telekomIndexPage.kupiPripejdBrojButton.shouldHave(Condition.attribute("href", "https://eshop.telekom.mk/category/tariff-prepaid/list/product_listing?bp=acquisition&productOfferingTerm=noagreement&selectedToggle=&utm_source=IKONA&utm_medium=TELEKOM_MK&utm_campaign=NOV_PRIPEJD_BROJ"));
    };

    @Test
    public void nadopolniKreditButton() throws InterruptedException {
        telekomIndexPage.samoNeophodniButton.click();
        Thread.sleep(1000);
        telekomIndexPage.nadopolniKreditButton.shouldBe(Condition.visible);
        telekomIndexPage.nadopolniKreditButton.hover();
        telekomIndexPage.nadopolniKreditButton.shouldHave(Condition.attribute("title", "Надополни кредит"));
        Thread.sleep(1000);
        telekomIndexPage.nadopolniKreditButton.shouldHave(Condition.attribute("href", "https://www.telekom.mk/topup/vaucersnew.aspx"));
        telekomIndexPage.nadopolniKreditButton.click();
    }

    @Test
    public void platiBrzoButton() throws InterruptedException {
        telekomIndexPage.samoNeophodniButton.click();
        Thread.sleep(1000);
        telekomIndexPage.platiBrzoButton.shouldBe(Condition.visible);
        telekomIndexPage.platiBrzoButton.hover();
        telekomIndexPage.platiBrzoButton.shouldHave(Condition.attribute("title", "Плати брзо"));
        Thread.sleep(1000);
        telekomIndexPage.platiBrzoButton.shouldHave(Condition.attribute("href", "https://www.telekom.mk/plationline/"));
        telekomIndexPage.platiBrzoButton.click();
    }

    @Test
    public void telefonSoNovBrojButton() throws InterruptedException {
        telekomIndexPage.samoNeophodniButton.click();
        Thread.sleep(1000);
        telekomIndexPage.telefonSoNovBrojButton.shouldBe(Condition.visible);
        telekomIndexPage.telefonSoNovBrojButton.hover();
        telekomIndexPage.telefonSoNovBrojButton.shouldHave(Condition.attribute("title", "Телефон со нов постпејд број"));
        Thread.sleep(1000);
        telekomIndexPage.telefonSoNovBrojButton.shouldHave(Condition.attribute("href", "https://eshop.telekom.mk/category/mobilni-uredi/list/product_listing?utm_source=IKONA&amp;utm_medium=TELEKOM_MK&amp;utm_campaign=NOV_BROJ_URED"));
        telekomIndexPage.telefonSoNovBrojButton.click();
    }

    @Test
    public void novPostpejdBrojButton() throws InterruptedException {
        telekomIndexPage.samoNeophodniButton.click();
        Thread.sleep(1000);
        telekomIndexPage.novPostpejdBrojButton.shouldBe(Condition.visible);
        telekomIndexPage.novPostpejdBrojButton.hover();
        telekomIndexPage.novPostpejdBrojButton.shouldHave(Condition.attribute("title", "Нов постпејд број"));
        Thread.sleep(1000);
        telekomIndexPage.novPostpejdBrojButton.shouldHave(Condition.attribute("href", "https://eshop.telekom.mk/category/mobile-postpaid/list/product_listing?bp=acquisition&amp;productOfferingTerm=agreement24&amp;selectedToggle=&amp;utm_source=IKONA&amp;utm_medium=TELEKOM_MK&amp;utm_campaign=NOV_BROJ"));
        telekomIndexPage.novPostpejdBrojButton.click();
    }

    @Test
    public void aktivirajESmetkaButton() throws InterruptedException {
        telekomIndexPage.samoNeophodniButton.click();
        Thread.sleep(1000);
        telekomIndexPage.aktivirajESmetkaButton.shouldBe(Condition.visible);
        telekomIndexPage.aktivirajESmetkaButton.hover();
        telekomIndexPage.aktivirajESmetkaButton.shouldHave(Condition.attribute("title", "Активирај е-сметка"));
        Thread.sleep(1000);
        telekomIndexPage.aktivirajESmetkaButton.shouldHave(Condition.attribute("href", "https://www.telekom.mk/aktiviranje-e-smetka.nspx"));
        telekomIndexPage.aktivirajESmetkaButton.click();
    }

    //endregion

    //region tests for link class
    @Test
    public void telekomMkAppButton() throws InterruptedException {
        telekomIndexPage.samoNeophodniButton.click();
        Thread.sleep(1000);
        telekomIndexPage.telekomMkAppButton.shouldBe(Condition.visible);
        telekomIndexPage.telekomMkAppButton.hover();
        telekomIndexPage.telekomMkAppButton.shouldHave(Condition.attribute("title", "Повеќе"));
        Thread.sleep(1000);
        telekomIndexPage.telekomMkAppButton.shouldHave(Condition.attribute("href", "https://www.telekom.mk/telekommk-app.nspx"));
        telekomIndexPage.telekomMkAppButton.click();
    }
    //endregion

    //region tests for hpLinksRow class

    @Test
    public void mojTelekomButton() throws InterruptedException {
        telekomIndexPage.samoNeophodniButton.click();
        Thread.sleep(1000);
        telekomIndexPage.mojTelekomButton.shouldBe(Condition.visible);
        telekomIndexPage.mojTelekomButton.hover();
        telekomIndexPage.mojTelekomButton.shouldHave(Condition.attribute("title", "Moj Telekom"));
        Thread.sleep(1000);
        telekomIndexPage.mojTelekomButton.shouldHave(Condition.attribute("href", "https://mojtelekom.mk/"));
        telekomIndexPage.mojTelekomButton.click();
    }

    @Test
    public void maxTvGoButton() throws InterruptedException {
        telekomIndexPage.samoNeophodniButton.click();
        Thread.sleep(1000);
        telekomIndexPage.maxTvGoButton.shouldBe(Condition.visible);
        telekomIndexPage.maxTvGoButton.hover();
        telekomIndexPage.maxTvGoButton.shouldHave(Condition.attribute("title", "MaxTV Go"));
        Thread.sleep(1000);
        telekomIndexPage.maxTvGoButton.shouldHave(Condition.attribute("href", "https://maxtvgo.mk/"));
        telekomIndexPage.maxTvGoButton.click();
    }

    @Test
    public void telekomWebmailButton() throws InterruptedException {
        telekomIndexPage.samoNeophodniButton.click();
        Thread.sleep(1000);
        telekomIndexPage.telekomWebmailButton.shouldBe(Condition.visible);
        telekomIndexPage.telekomWebmailButton.hover();
        telekomIndexPage.telekomWebmailButton.shouldHave(Condition.attribute("title", "Telekom Webmail"));
        Thread.sleep(1000);
        telekomIndexPage.telekomWebmailButton.shouldHave(Condition.attribute("href", "https://webmail.t.mk/cp/ps/main/login/Login?d=t.mk"));
        telekomIndexPage.telekomWebmailButton.click();
    }

    @Test
    public void telekomProdavniciButton() throws InterruptedException {
        telekomIndexPage.samoNeophodniButton.click();
        Thread.sleep(1000);
        telekomIndexPage.telekomProdavniciButton.shouldBe(Condition.visible);
        telekomIndexPage.telekomProdavniciButton.hover();
        telekomIndexPage.telekomProdavniciButton.shouldHave(Condition.attribute("title", "Telekom prodavnici"));
        Thread.sleep(1000);
        telekomIndexPage.telekomProdavniciButton.shouldHave(Condition.attribute("href", "https://telekom.mk/telekom-prodavnici-11110.nspx"));
        telekomIndexPage.telekomProdavniciButton.click();
    }

    @Test
    public void cenovniciButton() throws InterruptedException {
        telekomIndexPage.samoNeophodniButton.click();
        Thread.sleep(1000);
        telekomIndexPage.cenovniciButton.shouldBe(Condition.visible);
        telekomIndexPage.cenovniciButton.hover();
        telekomIndexPage.cenovniciButton.shouldHave(Condition.attribute("title", "Cenovnici"));
        Thread.sleep(1000);
        telekomIndexPage.cenovniciButton.shouldHave(Condition.attribute("href", "https://telekom.mk/cenovnici-uslugi-i-uslovi-za-koristenje.nspx"));
        telekomIndexPage.cenovniciButton.click();
    }

    @Test
    public void zastitaNaPodatociButton() throws InterruptedException {
        telekomIndexPage.samoNeophodniButton.click();
        Thread.sleep(1000);
        telekomIndexPage.zastitaNaPodatociButton.shouldBe(Condition.visible);
        telekomIndexPage.zastitaNaPodatociButton.hover();
        telekomIndexPage.zastitaNaPodatociButton.shouldHave(Condition.attribute("title", "Заштита на лични податоци"));
        Thread.sleep(1000);
        telekomIndexPage.zastitaNaPodatociButton.shouldHave(Condition.attribute("href", "https://telekom.mk/informacii-za-licni-podatoci.nspx"));
        telekomIndexPage.zastitaNaPodatociButton.click();
    }

    //endregion

    //region tests for dropdown mini-menu class

    @Test
    public void mkButton() throws InterruptedException {
        telekomIndexPage.samoNeophodniButton.click();
        Thread.sleep(1000);
        telekomIndexPage.mkButton.shouldBe(Condition.visible);
        telekomIndexPage.mkButton.hover();
        telekomIndexPage.mkButton.innerHtml().equals("МК");
        Thread.sleep(1000);
        telekomIndexPage.mkButton.shouldHave(Condition.attribute("href", "https://www.telekom.mk/privatni-korisnici.nspx"));
        telekomIndexPage.mkButton.click();
    }

    @Test
    public void sqButton() throws InterruptedException {
        telekomIndexPage.samoNeophodniButton.click();
        Thread.sleep(1000);
        telekomIndexPage.sqButton.shouldBe(Condition.visible);
        telekomIndexPage.sqButton.hover();
        telekomIndexPage.sqButton.innerHtml().equals("SQ");
        Thread.sleep(1000);
        telekomIndexPage.sqButton.shouldHave(Condition.attribute("href", "https://www.telekom.mk/shfrytezues-private.nspx"));
        telekomIndexPage.sqButton.click();
    }

    @Test
    public void enButton() throws InterruptedException {
        telekomIndexPage.samoNeophodniButton.click();
        Thread.sleep(1000);
        telekomIndexPage.enButton.shouldBe(Condition.visible);
        telekomIndexPage.enButton.hover();
        telekomIndexPage.enButton.innerHtml().equals("EN");
        Thread.sleep(1000);
        telekomIndexPage.enButton.shouldHave(Condition.attribute("href", "https://www.telekom.mk/prepaid-en.nspx"));
        telekomIndexPage.enButton.click();
    }

    //endregion

    //region test for qr id input

//    @Test
//    public void prebaruvanjeInput() throws InterruptedException {
//        String search = "Test search";
//        telekomIndexPage.samoNeophodniButton.click();
//        Thread.sleep(1000);
//        telekomIndexPage.prebaruvanjeAnchor.click();
//        Thread.sleep(1000);
//        telekomIndexPage.prebaruvanjeInput.shouldHave(Condition.attribute("placeholder", "Пребарување"));
//        telekomIndexPage.prebaruvanjeInput.shouldHave(Condition.attribute("type", "text"));
//        Thread.sleep(1000);
//        telekomIndexPage.prebaruvanjeInput.shouldHave(Condition.attribute("data-url", "prebaruvanje.nspx"));
//        telekomIndexPage.prebaruvanjeInput.shouldBe(Condition.visible);
//    }

    //endregion

    //region test for modal-body class

    @Test
    public void postavkiteZaKolacinja() throws InterruptedException {
        Thread.sleep(1000);
        telekomIndexPage.postavkiteZaKolacinja.shouldBe(Condition.visible);
        telekomIndexPage.postavkiteZaKolacinja.hover();
        telekomIndexPage.postavkiteZaKolacinja.shouldHave(Condition.attribute("title", "Cookie settings"));
        Thread.sleep(1000);
        telekomIndexPage.postavkiteZaKolacinja.shouldHave(Condition.attribute("href", "https://www.telekom.mk/privatni-korisnici.nspx#settingsModal"));
        telekomIndexPage.postavkiteZaKolacinja.click();
    }

    //endregion

    //region tests for modal-footer class

    @Test
    public void prifatiGiSiteButton() throws InterruptedException {
        Thread.sleep(1000);
        telekomIndexPage.prifatiGiSiteButton.shouldBe(Condition.visible);
        telekomIndexPage.prifatiGiSiteButton.hover();
        telekomIndexPage.prifatiGiSiteButton.shouldHave(Condition.attribute("data-cookie-option-set", "all"));
        Thread.sleep(1000);
        telekomIndexPage.prifatiGiSiteButton.shouldHave(Condition.attribute("href", "https://www.telekom.mk/privatni-korisnici.nspx#"));
        telekomIndexPage.prifatiGiSiteButton.click();
    }

    @Test
    public void samoNeophodniButton() throws InterruptedException {
        Thread.sleep(1000);
        telekomIndexPage.samoNeophodniButton.shouldBe(Condition.visible);
        telekomIndexPage.samoNeophodniButton.hover();
        telekomIndexPage.samoNeophodniButton.shouldHave(Condition.attribute("data-cookie-option-set", "all"));
        Thread.sleep(1000);
        telekomIndexPage.samoNeophodniButton.shouldHave(Condition.attribute("href", "https://www.telekom.mk/privatni-korisnici.nspx#"));
        telekomIndexPage.samoNeophodniButton.click();
    }

    @Test
    public void promeniNagoduvanjeButton() throws InterruptedException {
        Thread.sleep(1000);
        telekomIndexPage.promeniNagoduvanjeButton.shouldBe(Condition.visible);
        telekomIndexPage.promeniNagoduvanjeButton.hover();
        telekomIndexPage.promeniNagoduvanjeButton.shouldHave(Condition.attribute("data-cookie-option-set", "custom"));
        Thread.sleep(1000);
        telekomIndexPage.promeniNagoduvanjeButton.shouldHave(Condition.attribute("href", "https://www.telekom.mk/privatni-korisnici.nspx#"));
        telekomIndexPage.promeniNagoduvanjeButton.click();
    }

    //endregion

    //region tests for settingsModal id

    @Test
    public void zadolzitelniKolacinjaButton() throws InterruptedException {
        telekomIndexPage.postavkiteZaKolacinja.click();
        Thread.sleep(1000);
        telekomIndexPage.zadolzitelniKolacinjaButton.shouldHave(Condition.attribute("type", "checkbox"));
        Thread.sleep(1000);
        telekomIndexPage.zadolzitelniKolacinjaButton.shouldNotBe(Condition.visible);
    }

    @Test
    public void analitickiKolacinjaButton() throws InterruptedException {
        telekomIndexPage.postavkiteZaKolacinja.click();
        Thread.sleep(1000);
        telekomIndexPage.analitickiKolacinjaButton.shouldHave(Condition.attribute("type", "checkbox"));
        telekomIndexPage.analitickiKolacinjaButton.click();
        Thread.sleep(1000);
        telekomIndexPage.analitickiKolacinjaButton.shouldNotBe(Condition.visible);
    }

    @Test
    public void funkcionalniKolacinjaButton() throws InterruptedException {
        telekomIndexPage.postavkiteZaKolacinja.click();
        Thread.sleep(1000);
        telekomIndexPage.funkcionalniKolacinjaButton.shouldHave(Condition.attribute("type", "checkbox"));
        telekomIndexPage.funkcionalniKolacinjaButton.click();
        Thread.sleep(1000);
        telekomIndexPage.funkcionalniKolacinjaButton.shouldNotBe(Condition.visible);
    }

    //endregion
}