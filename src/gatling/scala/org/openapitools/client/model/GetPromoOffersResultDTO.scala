
package org.openapitools.client.model


case class GetPromoOffersResultDTO (
    /* Товары, которые участвуют или могут участвовать в акции. */
    _offers: List[GetPromoOfferDTO],
    _paging: Option[ForwardScrollingPagerDTO]
)
object GetPromoOffersResultDTO {
    def toStringBody(var_offers: Object, var_paging: Object) =
        s"""
        | {
        | "offers":$var_offers,"paging":$var_paging
        | }
        """.stripMargin
}
