
package org.openapitools.client.model


case class PutSkuBidsRequest (
    /* Список товаров и ставки для продвижения, которые на них нужно установить. */
    _bids: List[SkuBidItemDTO]
)
object PutSkuBidsRequest {
    def toStringBody(var_bids: Object) =
        s"""
        | {
        | "bids":$var_bids
        | }
        """.stripMargin
}
