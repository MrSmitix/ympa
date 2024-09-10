package org.openapitools.server.model


/**
 * Данные о складе отправления.
 *
 * @param id Идентификатор склада отправления. for example: ''null''
 * @param name Наименование склада отправления. for example: ''null''
 * @param address Адрес склада отправления. for example: ''null''
*/
final case class PartnerShipmentWarehouseDTO (
  id: Option[Long] = None,
  name: Option[String] = None,
  address: Option[String] = None
)

