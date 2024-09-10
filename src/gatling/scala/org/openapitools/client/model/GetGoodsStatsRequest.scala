
package org.openapitools.client.model


case class GetGoodsStatsRequest (
    /* Список ваших идентификаторов SKU.  */
    _shopSkus: Set[String]
)
object GetGoodsStatsRequest {
    def toStringBody(var_shopSkus: Object) =
        s"""
        | {
        | "shopSkus":$var_shopSkus
        | }
        """.stripMargin
}
