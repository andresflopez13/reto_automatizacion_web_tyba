# language: es
# Test Automation web for Tyba
# Summary: This feature contains test cases for Swag Labs page
# EP Authentication is deployed in https://www.saucedemo.com/

Característica: Autenticación en la pagina de Swag Labs

  Escenario: Autenticacion correcta
    Dado que "Andres" desea loguearse en Swag Labs
    Cuando ingresa el email y contrasenia correcta
    Entonces verifica que el usuario se autentica correctamente

  Escenario: Intento de autenticacion con contraseña erronea
    Dado que "Andres" desea loguearse en Swag Labs
    Cuando ingresa el email y contrasenia incorrecta
    Entonces verifica que se informe el error de autenticacion