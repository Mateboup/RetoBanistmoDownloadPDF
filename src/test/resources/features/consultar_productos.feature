#language:es

  @ConsultarProductos
Característica: Ingresar opcion tarjeta de credito y validar que el PDF sea correcto
  Yo como usuario
  Quiero ingresar a la opcion de tarjeta de credito
  Para validar que el contrato de tarjetas de credito sea correcto

  Esquema del escenario: Validar que el contrato de tarjetas sea el correcto
    ##Dado que un usuario ingresa a la pagina de Banistmo
    Cuando ingrese a la opcion y al producto
    Entonces debe descargar el PDF de contrato de tarjetas

    Ejemplos:

 | opciones                | productos           |
 | Productos y Servicios   | Tarjetas de Credito |