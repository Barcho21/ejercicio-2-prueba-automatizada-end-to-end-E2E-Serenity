# language: es
Característica: Compra E2E en SauceDemo
  Como usuario final
  Quiero autenticarme y realizar una compra
  Para completar un flujo E2E hasta la confirmación del pedido

  @compra_e2e
  Escenario: Flujo completo de compra
    Dado que "Usuario" abre la aplicación de SauceDemo
    Cuando inicia sesión con usuario "standard_user" y password "secret_sauce"
    Y agrega los productos "sauce-labs-backpack" y "sauce-labs-bike-light" al carrito
    Y navega al carrito
    Y completa el checkout con nombre "Juan", apellido "Pérez" y código "010101"
    Y finaliza la compra
    Entonces debería ver el mensaje de confirmación que contiene "THANK YOU FOR YOUR ORDER"
