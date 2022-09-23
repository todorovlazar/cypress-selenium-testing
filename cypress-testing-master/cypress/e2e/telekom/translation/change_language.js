/// <reference types="cypress" />

beforeEach(() => {
    cy.visit('https://www.telekom.mk/')
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
});

it('Change language', function() {
    cy.get('[class="header"] > div').children('div').eq(3).get('div').first().get('a').first().click().should('contain.text', 'Furnizime')
})