
package org.openapitools.client.model


case class GetOffersResponse (
    /* Список предложений магазина. */
    _offers: List[OfferDTO],
    _pager: Option[FlippingPagerDTO]
)
object GetOffersResponse {
    def toStringBody(var_offers: Object, var_pager: Object) =
        s"""
        | {
        | "offers":$var_offers,"pager":$var_pager
        | }
        """.stripMargin
}
