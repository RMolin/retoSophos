@Cucumber
Feature: Ingresar a Sophos y buscar ofertas de empleo
  
  Este feature se trata de ingresar a la pagina principal de Sophos
  y buscar la informacion de las ofertas de trabajo
  e imprimirlas en la consola...

  @IngresarAvianca
  Scenario: Seleccionar vuelo de la pagina
    Given Que Rober ingresa a la pagina principal de Sophos
    When Rober se dirige a la pagina de empleos
    Then Rober imprime la informacion de las ofertas encontradas
