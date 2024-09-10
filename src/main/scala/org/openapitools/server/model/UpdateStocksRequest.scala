package org.openapitools.server.model


/**
 * Запрос на изменение информации по остаткам товаров.
 *
 * @param skus Данные об остатках товаров.  for example: ''null''
*/
final case class UpdateStocksRequest (
  skus: Set[UpdateStockDTO]
)

