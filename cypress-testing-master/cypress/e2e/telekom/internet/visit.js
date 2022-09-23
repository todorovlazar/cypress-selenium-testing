/// <reference types="cypress" />

it('Navigation to MaxTV using Android TV box', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="internet"]').click()
        .get('[class="dropdown-menu"]').eq(0)
        .get('[class="dropli"]').contains('MaxTV преку Android TV box').click()
    cy.url().should('eq', Cypress.config().baseUrl + '/android-and-tv.nspx')
})

it('Navigation to MaxTV GO', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="internet"]').click()
        .get('[class="dropdown-menu"]').eq(0)
        .get('[class="dropli"]').contains('MaxTV GO').click()
    cy.url().should('eq', Cypress.config().baseUrl + '/maxtv-go.nspx')
})

it('Navigation to Extra TV Packets', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="internet"]').click()
        .get('[class="dropdown-menu"]').eq(0)
        .get('[class="dropli"]').contains('Дополнителни ТВ пакети').click()
    cy.url().should('eq', Cypress.config().baseUrl + '/dopolnitelni-tv-paketi.nspx')
})

it('Navigation to TV Channels', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="internet"]').click()
        .get('[class="dropdown-menu"]').eq(0)
        .get('[class="dropli"]').contains('ТВ Канали').click()
    cy.url().should('eq', Cypress.config().baseUrl + '/tv-kanali.nspx')
})

it('Navigation to Extra Services', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="internet"]').click()
        .get('[class="dropdown-menu"]').eq(0)
        .get('[class="dropli"]').contains('Дополнителни услуги').click()
    cy.url().should('eq', Cypress.config().baseUrl + '/internet-dopolnitelni-uslugi.nspx')
})

it('Navigation to Free Account', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="internet"]').click()
        .get('[class="dropdown-menu"]').eq(0)
        .get('[class="dropli"]').contains('Бесплатна e-адреса').click()
    cy.url().should('eq', Cypress.config().baseUrl + '/besplatna-eadresa.nspx')
})

it('Navigation to Internet Security', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="internet"]').click()
        .get('[class="dropdown-menu"]').eq(0)
        .get('[class="dropli"]').contains('Интернет безбедност').click()
    cy.url().should('eq', Cypress.config().baseUrl + '/internet-bezbednost-kaspersky.nspx')
})

it('Visibility of the Internet Link', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="internet"]').should('be.visible')
})

it('Visibility of the Internet Menu', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="internet"]').click()
        .get('[class="dropdown-menu"]').eq(0).invoke('show')
    cy.get('[class="dropdown-menu"]').should('be.visible')
})

it('Visibility of the Close Menu Button', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="internet"]').click()
        .get('[class="dropdown-menu"]').invoke('show')
        .get('[class="close-menu-btn tele-icon"]').first().invoke('show')
    cy.get('[class="close-menu-btn tele-icon"]').should('be.visible')
})

it('Visibility of MaxTV GO', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="internet"]').click()
        .get('[class="dropdown-menu"]').eq(0)
        .get('[class="dropli"]').contains('MaxTV GO')
        .should('be.visible')
})


it('Visibility of MaxTV using Android TV box', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="internet"]').click()
        .get('[class="dropdown-menu"]').eq(0)
        .get('[class="dropli"]').contains('MaxTV преку Android TV box')
        .should('be.visible')
})

it('Visibility Internet 5G', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="internet"]').click()
        .get('[class="dropdown-menu"]').eq(0).invoke('show')
    cy.get('[class="five_g_menu"]').should('be.visible')
})

it('Visibility Communications Mobile Applications', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="communication"]').click()
        .get('[class="dropdown-menu"]').eq(0).invoke('show')
    cy.get('[class="mobApp-privatni"]').should('be.visible')
})
