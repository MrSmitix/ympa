package org.openapitools.server.model


/**
 * Склад Маркета (FBY).
 *
 * @param id Идентификатор склада. for example: ''null''
 * @param name Название склада. for example: ''null''
 * @param address  for example: ''null''
*/
final case class FulfillmentWarehouseDTO (
  id: Long,
  name: String,
  address: Option[WarehouseAddressDTO] = None
)

