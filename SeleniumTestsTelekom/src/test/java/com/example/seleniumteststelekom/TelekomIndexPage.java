package com.example.seleniumteststelekom;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class TelekomIndexPage {

    // right-side-content class
    public SelenideElement kupiPripejdBrojButton = $x("//*[@class=\"right-side-content\"]/div[1]/a[1]");
    public SelenideElement nadopolniKreditButton = $x("//*[@class=\"right-side-content\"]/div[1]/a[2]");
    public SelenideElement platiBrzoButton = $x("//*[@class=\"right-side-content\"]/div[1]/a[3]");
    public SelenideElement telefonSoNovBrojButton = $x("//*[@class=\"right-side-content\"]/div[2]/a[1]");
    public SelenideElement novPostpejdBrojButton = $x("//*[@class=\"right-side-content\"]/div[2]/a[2]");
    public SelenideElement aktivirajESmetkaButton = $x("//*[@class=\"right-side-content\"]/div[2]/a[3]");

    // link class
    public SelenideElement telekomMkAppButton = $x("//*[@class=\"link\"]/a");

    // qr id
    public SelenideElement prebaruvanjeAnchor = $x("//*[@class=\"search-icon hidden-xs pull-right\"]");
    public SelenideElement prebaruvanjeInput = $x("//*[@class=\"search-input form-control\"]");

    // hpLinkBox-red id / hpLinksRow class
    public SelenideElement mojTelekomButton = $x("//*[@id=\"hpLinkBox-red\"]/div[1]/div/a");
    public SelenideElement maxTvGoButton = $x("//*[@id=\"hpLinkBox-red\"]/div[2]/div/a");
    public SelenideElement telekomWebmailButton = $x("//*[@id=\"hpLinkBox-red\"]/div[3]/div/a");
    public SelenideElement telekomProdavniciButton = $x("//*[@id=\"hpLinkBox-red\"]/div[4]/div/a");
    public SelenideElement cenovniciButton = $x("//*[@id=\"hpLinkBox-red\"]/div[5]/div/a");
    public SelenideElement zastitaNaPodatociButton = $x("//*[@id=\"hpLinkBox-red\"]/div[6]/div/a");

    // dropdown mini-menu class
    public SelenideElement mkButton = $x("//*[@class=\"dropdown mini-menu\"]/div[1]/a");
    public SelenideElement sqButton = $x("//*[@class=\"dropdown mini-menu\"]/div[2]/a");
    public SelenideElement enButton = $x("//*[@class=\"dropdown mini-menu\"]/div[3]/a");

    // modal-body class
    public SelenideElement postavkiteZaKolacinja = $x("//*[@class=\"modal-body\"]/p/a");

    // modal-footer class
    public SelenideElement prifatiGiSiteButton = $x("//*[@class=\"modal-footer\"]/ul/li[1]/a");
    public SelenideElement samoNeophodniButton = $x("//*[@class=\"modal-footer\"]/ul/li[2]/a");
    public SelenideElement promeniNagoduvanjeButton = $x("//*[@class=\"modal-footer\"]/ul/li[3]/a");

    // settingsModal - required-checkbox,
    public SelenideElement zadolzitelniKolacinjaButton = $x("//*[@id=\"required-checkbox\"]");
    public SelenideElement analitickiKolacinjaButton = $x("//*[@id=\"analytical-checkbox\"]");
    public SelenideElement funkcionalniKolacinjaButton = $x("//*[@id=\"functionality-checkbox\"]");
}
