
package org.openapitools.client.model


case class OfferPriceByOfferIdsListResponseDTO (
    /* Страница списка цен. */
    _offers: List[OfferPriceByOfferIdsResponseDTO],
    _paging: Option[ScrollingPagerDTO]
)
object OfferPriceByOfferIdsListResponseDTO {
    def toStringBody(var_offers: Object, var_paging: Object) =
        s"""
        | {
        | "offers":$var_offers,"paging":$var_paging
        | }
        """.stripMargin
}
