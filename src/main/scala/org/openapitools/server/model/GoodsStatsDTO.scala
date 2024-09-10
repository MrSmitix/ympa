package org.openapitools.server.model


/**
 * Отчет по товарам.
 *
 * @param shopSkus Список товаров. for example: ''null''
*/
final case class GoodsStatsDTO (
  shopSkus: Seq[GoodsStatsGoodsDTO]
)

