
package org.openapitools.client.model


case class GoodsStatsDTO (
    /* Список товаров. */
    _shopSkus: List[GoodsStatsGoodsDTO]
)
object GoodsStatsDTO {
    def toStringBody(var_shopSkus: Object) =
        s"""
        | {
        | "shopSkus":$var_shopSkus
        | }
        """.stripMargin
}
