package org.openapitools.server.model


/**
 * Запрос отчета по товарам.
 *
 * @param shopSkus Список ваших идентификаторов SKU.  for example: ''null''
*/
final case class GetGoodsStatsRequest (
  shopSkus: Set[String]
)

