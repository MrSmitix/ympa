package org.openapitools.server.model


/**
 * Информация о складе.
 *
 * @param id Идентификатор склада. for example: ''null''
 * @param name Название склада. for example: ''null''
 * @param stocks Информация об остатках товаров на складе. for example: ''null''
*/
final case class GoodsStatsWarehouseDTO (
  id: Option[Long] = None,
  name: Option[String] = None,
  stocks: Seq[WarehouseStockDTO]
)

