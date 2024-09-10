package org.openapitools.server.model


/**
 * Информация об остатках товара.
 *
 * @param `type`  for example: ''null''
 * @param count Значение остатков. for example: ''null''
*/
final case class WarehouseStockDTO (
  `type`: WarehouseStockType,
  count: Long
)

