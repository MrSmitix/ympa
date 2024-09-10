package org.openapitools.server.model


/**
 * Адрес склада.
 *
 * @param city Город. for example: ''null''
 * @param street Улица. for example: ''null''
 * @param number Номер дома. for example: ''null''
 * @param building Номер строения. for example: ''null''
 * @param block Номер корпуса. for example: ''null''
 * @param gps  for example: ''null''
*/
final case class WarehouseAddressDTO (
  city: String,
  street: Option[String] = None,
  number: Option[String] = None,
  building: Option[String] = None,
  block: Option[String] = None,
  gps: GpsDTO
)

