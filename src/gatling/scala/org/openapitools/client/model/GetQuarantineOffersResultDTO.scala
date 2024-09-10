
package org.openapitools.client.model


case class GetQuarantineOffersResultDTO (
    _paging: Option[ScrollingPagerDTO],
    /* Страница списка товаров в карантине. */
    _offers: List[QuarantineOfferDTO]
)
object GetQuarantineOffersResultDTO {
    def toStringBody(var_paging: Object, var_offers: Object) =
        s"""
        | {
        | "paging":$var_paging,"offers":$var_offers
        | }
        """.stripMargin
}
