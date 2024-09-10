
package org.openapitools.client.model


case class GetBidsInfoResponseDTO (
    /* Страница списка товаров. */
    _bids: List[SkuBidItemDTO],
    _paging: Option[ForwardScrollingPagerDTO]
)
object GetBidsInfoResponseDTO {
    def toStringBody(var_bids: Object, var_paging: Object) =
        s"""
        | {
        | "bids":$var_bids,"paging":$var_paging
        | }
        """.stripMargin
}
