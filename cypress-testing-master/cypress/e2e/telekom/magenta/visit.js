/// <reference types="cypress" />

beforeEach(() => {
    cy.visit('https://www.telekom.mk/')
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.get('[class="magenta"]').click().get('[class="dropli"]').first().click()
})

it('Visibility', function() {
    cy.visit('https://www.telekom.mk/')
    cy.get('[class="magenta"]').should('be.visible')
})

it('Navigation', function() {
    cy.get('[class="container-fluid"]').should('be.visible')
})

it('Choose package', function() {
    cy.get('[class="numberOfPackages"]').children('div').eq(1).click({ force: true })
    cy.contains('[class="numberOfPackages"]', "1")
})

it('Check radio functionality', function() {
    cy.get('[class="row tvPackagesCalc tvPackages"]').children('div').children('input')
    .should('be.checked')
})

it('Button check', function() {
    cy.get('[class="btn-next-step hidden-xs ng-isolate-scope btn-magenta"]')
    .should('have.attr', 'ng-click')
    .and('include', 'bestBuy')
})