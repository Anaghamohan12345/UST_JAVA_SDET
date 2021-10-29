describe('simple Test', function () {
    // Test case
       it('Scenario 1', function (){
          // test step for URL launching
          cy.visit("http://127.0.0.1:5500/cypress/project-specfile.html");

       });

       it('Scenario 2', function (){

         cy.get('[type="radio"]').first().check()
      });
      it('Scenario 3', function (){

         cy.get('[type="checkbox"]').first().check()
      });
      
      it('Scenario 4', function (){

         cy.title().should('eq', 'Angular JS Forms')
      });

      it('Scenario 5', function (){

         cy.get('[name="firstname"]').type(' Mohan')
         cy.get('[name="lastname"]').type('A')
         cy.get('[name="email"]').type('anagha@gmail.com')
         cy.get('[name="Phone"]').type('1234567890')
        
      });

      it('Scenario 6', function (){

         cy.get('[value="Jump"]').check()
      });

      it('Scenario 7', function (){

         cy.get('[value="Spanish"]').check()
      });
      it('Scenario 8', function (){

         cy.get('#location').select('Cochin')
      });

      it('Scenario 9', function (){

         cy.get('#location').select('Trivandrum')
      });


      it('Scenario 10', function (){

         cy.visit("http://127.0.0.1:5500/cypress/project-specfile.html")
         cy.get('#mstatus').select('Unmarried')
         
         }); 
      });
      