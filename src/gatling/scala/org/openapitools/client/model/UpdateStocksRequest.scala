
package org.openapitools.client.model


case class UpdateStocksRequest (
    /* Данные об остатках товаров.  */
    _skus: Set[UpdateStockDTO]
)
object UpdateStocksRequest {
    def toStringBody(var_skus: Object) =
        s"""
        | {
        | "skus":$var_skus
        | }
        """.stripMargin
}
