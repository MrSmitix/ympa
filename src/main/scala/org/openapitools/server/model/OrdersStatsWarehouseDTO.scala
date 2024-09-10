package org.openapitools.server.model


/**
 * Информация о складе, на котором хранится товар.
 *
 * @param id Идентификатор склада. for example: ''null''
 * @param name Название склада. for example: ''null''
*/
final case class OrdersStatsWarehouseDTO (
  id: Option[Long] = None,
  name: Option[String] = None
)

