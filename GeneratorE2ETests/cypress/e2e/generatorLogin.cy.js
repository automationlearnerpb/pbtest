// This spec file details tests for Generator login for locally setup generator


describe('Test Generator login and permissions', () => {
  beforeEach (() => {
    //This navigates to auth page through baseUrl/auth
    cy.visit('/auth')

    // This is needed as authentication is cross domain and url is forwarded to keycloak
    cy.origin('https://local.gai.webperfdev.com/auth', () => {
    cy.get('#username').type('admin@eggplant.io')
    cy.get('#password').type('wibblewobble')
    cy.get('#kc-login').click()

    })
  })

  it('should have a side bar expand option', () => {
    cy.get("[data-testid='expand-sidebar']").should('be.visible').click()
    //cy.findByRole('button', {})
    cy.findAllByText('Import').should('be.visible').click()

  })
  

  it('should load the collections page', () => {
    //cy.get('#root > div.flex > div.min-h-screen.w-full.grow.bg-grey-page-background.p-4 > div.documents-header-min.border-gray-d2.flex.flex-col.rounded-md.border-1.bg-white.px-4.py-3 > div > div:nth-child(1) > h2').should('be.visible')
    cy.get('.documents-header-min .text-xl').should('contain.text', 'Collections')
   // cy.get('#root').findByRole('link', {pathname: /context-files}).should('have.attr', 'href').and('include')
    cy.get('a[href="/context-files"]').should('be.visible').click()
  })


})