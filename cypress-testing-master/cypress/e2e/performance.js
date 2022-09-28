/// <reference types="cypress" />
import 'cypress-lighthouse'

it('Testing lighthouse', function() {
    cy.visit('www.telekom.mk')
    cy.get('[class="btn btn-brand cookie-set-btn"]').first().click()
    cy.lighthouse()
    cy.lighthouse(
        {
            performance: 50,
            accessibility: 92,
            "best-practices": 75,
            seo: 91,
        },
        {
            formFactor: "desktop",
            screenEmulation: {
                mobile: false,
                disable: false,
                width: Cypress.config("viewportWidth"),
                height: Cypress.config("viewportHeight"),
                devicesScaleRatio: 1
            },
        },
    )
})
