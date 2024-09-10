package org.openapitools.server.model


/**
 * Информация об остатках товаров на складе.
 *
 * @param warehouseId Идентификатор склада. for example: ''null''
 * @param offers Информация об остатках. for example: ''null''
*/
final case class WarehouseOffersDTO (
  warehouseId: Long,
  offers: Seq[WarehouseOfferDTO]
)

