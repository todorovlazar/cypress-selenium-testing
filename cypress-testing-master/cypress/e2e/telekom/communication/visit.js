/// <reference types="cypress" />

it('Visibility Communications', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="communication"]').should('be.visible')
})

it('Visibility Communications Menu', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="communication"]').click()
        .get('[class="dropdown-menu"]').eq(0).invoke('show')
    cy.get('[class="dropdown-menu"]').should('be.visible')
})

it('Visibility Communications 5G', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="communication"]').click()
        .get('[class="dropdown-menu"]').eq(0).invoke('show')
    cy.get('[class="five_g_menu"]').should('be.visible')
})

it('Visibility of the Close Menu Button', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="communication"]').click()
        .get('[class="dropdown-menu"]').invoke('show')
        .get('[class="close-menu-btn tele-icon"]').first()
    cy.get('[class="close-menu-btn tele-icon"]').should('be.visible')
})

it('Visibility Communications Mobile Applications', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="communication"]').click()
        .get('[class="dropdown-menu"]').eq(0).invoke('show')
    cy.get('[class="mobApp-privatni"]').should('be.visible')
})

it('Navigation to Prepaid E-Sim', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="communication"]').click()
        .get('[class="dropdown-menu"]').eq(2).invoke('show')
        .get('[class="dropli"]').eq(2).invoke('show')
        .get('[class="strelche has-submenu"]').eq(4).invoke('show').click()
    cy.url().should('eq', Cypress.config().baseUrl + '/pripejd.nspx')
    cy.get('[id="esim-pripejd"]').click()
    cy.url().should('eq', Cypress.config().baseUrl + '/esim.nspx')
})

it('Navigation to Prepaid E-Sim Details', function() {
    cy.visit(Cypress.config().baseUrl + '/esim.nspx')
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="esim-link"]').click()
    cy.url().should('eq', Cypress.config().baseUrl + '/mobile-device-details.nspx?deviceId=66666&tariffId=prepaid&groupId=0&contractId=8&paymentId=1&name=eSIM%%D0%9F%D0%A0%D0%98%D0%9F%D0%95%D0%88%D0%94&type=eSim')
})

it('Navigation to Tariffs Mobile', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').eq(0).click()
    cy.get('[class="communication"]').click()
        .get('[class="dropdown-menu"]').eq(0).invoke('show')
        .get('[class="dropli"]').eq(1).invoke('show')
        .get('[class="strelche has-submenu"]').eq(2).click()
    cy.url().should('eq', Cypress.config().baseUrl + '/mobile.nspx')
})

it('Navigation to Postpaid Roaming', function() {
    cy.visit(Cypress.config().baseUrl)
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="communication"]').click()
        .get('[class="dropdown-menu"]').eq(1).invoke('show')
        .get('[class="dropli"]').eq(2).invoke('show')
        .get('[class="strelche has-submenu"]').eq(3).click()
    cy.url().should('eq', Cypress.config().baseUrl + '/roaming.nspx')
})
