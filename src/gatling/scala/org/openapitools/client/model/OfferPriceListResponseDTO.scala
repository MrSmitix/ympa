
package org.openapitools.client.model


case class OfferPriceListResponseDTO (
    /* Страница списка. */
    _offers: List[OfferPriceResponseDTO],
    _paging: Option[ScrollingPagerDTO],
    /* Количество всех цен магазина, измененных через API. */
    _total: Option[Integer]
)
object OfferPriceListResponseDTO {
    def toStringBody(var_offers: Object, var_paging: Object, var_total: Object) =
        s"""
        | {
        | "offers":$var_offers,"paging":$var_paging,"total":$var_total
        | }
        """.stripMargin
}
