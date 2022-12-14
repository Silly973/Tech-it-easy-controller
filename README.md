TECH IT EASY CONTROLLER

INLEIDING

Je bent net begonnen als developer bij een bedrijf genaamd Tech It Easy, dat TV's verkoopt. Tijdens de cursus Spring Boot ga jij een backend applicatie programmeren voor het bedrijf. De winkel heeft een inventaris van televisies die moet worden bijgehouden. Na iedere les gaan we deze applicatie een stukje verder uitbouwen door middel van de huiswerkopdrachten. Zo krijg je stap-voor-stap meer ervaring in het bouwen van een backend applicatie. Aan het einde van de cursus zullen we een werkende Tech It Easy backend applicatie hebben!

OPDRACHTBESCHRIJVING

Je gaat via de Spring Boot Initialzr een project aanmaken, waarbij je gebruikmaakt van de volgende dependency:

* Spring Web

* Gedurende de cursus Spring Boot zal het langzamerhand duidelijk worden waarom je deze dependency nodig hebt. Voor nu mag je dit gewoon van ons aannemen!

RANDVOORWAARDEN

De opdracht moet voldoen aan de volgende voorwaarden:

* Het project bevat, op de juiste plaats in de map-structuur, een map genaamd Controllers;
* Het project bevat, op de juiste plaats in de map-structuur, een map genaamd Exceptions;
* Het project bevat een TelevisionsController;
* Het project bevat een ExceptionController;
* Het project bevat een RecordNotFoundException;
* De TelevisionsController bevat:
  - een GET-request voor alle televisies
  - een GET-request voor 1 televisie
  - een POST-request voor 1 televisie
  - een PUT-request voor 1 televisie
  - een DELETE-request voor 1 televisie
* De ExceptionController bevat:
  - een exceptionhandler
* De RecordNotFoundException bevat:
  - een default exception
  - een exception met message

BELANGRIJK

Bij het inleveren van deze opdracht is de applicatie nog niet functioneel, omdat we hier meer kennis over andere technieken voor nodig hebben die later in de cursus aan bod komt.

Je mag de volgende ResponseEntiteiten als return waardes gebruiken:

* ResponseEntiteit.ok("television")
* ResponseEntiteit.created(null).body("television")
* ResponseEntiteit.noContent().build()
* Stappenplan
Let op: het is uitdagender om jouw eigen stappenplan te maken. Mocht je niet zo goed weten waar je moet beginnen, kun je onderstaand stappenplan volgen:

1. Zet een nieuw project op via Spring Boot Initialzr genaamd TechItEasy.
2. Maak een nieuwe map aan in je project genaamd Controllers.
3. Maak een nieuwe map aan in je project genaamd Exceptions.
4. Maak een nieuwe klasse aan in de map Controllers voor de TelevisionController.
5. Voorzie de klasse van de juiste annotatie.
6. Maak in de klasse de (in de randvoorwaarden) gevraagde requests aan met de juiste response entities.
7. Maak een nieuwe klasse aan in de map Controllers voor de ExceptionController.
8. Voorzie de klasse van de juiste annotatie.
9. Maak in de klasse een exceptionHandler met de juiste notatie en response entitiy.
10. Maak een nieuwe klasse aan in de map Exceptions.
11. Extent de klasse met de RunTimeException.
12. Vul de klasse aan aan de hand van het voorbeeld in hoofdstuk 5.11 van de cursus Spring Boot.

TECH IT EASY MODEL

RECAP VAN VORIGE OPDRACHT
Je hebt de vorige les een begin gemaakt voor de applicatie voor je werkgever TechItEasy. Je hebt een controller aangemaakt met verschillende endpoints. Deze kunnen aangeroepen worden via een frontend. Jij maakt hiervoor gebruik van Postman. Omdat we niet weten of alles bestaat wat de gebruiker opvraagt heb je ook een exception controller gemaakt en een RecordNotFound exception. Na een nieuwe les Spring boot ben je klaar voor de volgende stap van het bouwen van je applicatie.

RANDVOORWAARDEN
* Het project bevat, op de juiste plaats in de map-structuur, een map genaamd Models;
* Het project bevat, op de juiste plaats in de map-structuur, een map genaamd Repositories;
* Het project bevat een Television in de map Models;
* Het project bevat een TelevisionRepository;
* Het project bevat de volgende dependencies:
  * Spring Web
  * Spring Data Jpa
  * PostgreSQL Driver
* ## **!!!!!!**De Application.properties bevat de properties uit hoofdstuk 9.2 van de cursus Spring Boot(met aangepaste namen)
* De TelevisionRepository extends JpaRepository met de juiste parameters
* De Television bevat: -de attributen:
  * Long id (incl. annotaties id en generatedValue)
  * String type
  * String brand
  * String name
  * Double price
  * Double availableSize
  * Double refreshRate
  * String screenType
  * String screenQuality
  * Boolean smartTv
  * Boolean wifi
  * Boolean voiceControl
  * Boolean hdr
  * Boolean bluetooth
  * Boolean ambiLight
  * Integer originalStock
  * Integer sold
  * default constructor
  * constructor
  * alle getters en setters
 
  BELANGRIJK
  * Bij het inleveren van deze opdracht is deze applicatie nog niet functioneel, hier hebben we meer kennis over andere technieken voor nodig.
  Laat de application.properties overeenkomen met de gegevens van PgAdmin
  * Je mag de volgende ResponseEntiteiten als return waardes gebruiken:
    * ResponseEntiteit.ok("television")
    * ResponseEntiteit.created(null).body("television")
    * ResponseEntiteit.noContent().build()
    
  STAPPENPLAN
    Let op: het is uitdagender om jouw eigen stappenplan te maken. Mocht je niet zo goed weten waar je moet beginnen, kun je onderstaand stappenplan volgen:

13. Voeg de benodigde dependencies toe aan je POM.xml en laat Maven deze instaleren
14. Voeg aan de application.properties de benodigde properties toe
15. Maak een nieuwe database aan in PgAdmin (zorg dat de naam overeenkomt met de properties in je _application.properties)
16. Maak een nieuwe map aan in je project voor Models
17. Maak een nieuwe klasse genaamd Television
18. Voeg de annotatie @Entity toe aan de klasse
19. Voeg de juiste attributen toe aan de klasse
20. Voeg de beide constructors toe aan de klasse
21. Voeg alle getters & setters toe aan de klasse
22. Maak een nieuwe map aan in je project voor Repositories
23. Voeg aan deze map een nieuwe klasse toe genaamd TelevisionRepository
24. Extend de repository met de JpaRepository en geef de juiste attributen mee