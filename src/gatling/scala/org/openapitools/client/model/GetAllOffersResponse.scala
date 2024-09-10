
package org.openapitools.client.model


case class GetAllOffersResponse (
    /* Список предложений магазина. */
    _offers: List[OfferDTO]
)
object GetAllOffersResponse {
    def toStringBody(var_offers: Object) =
        s"""
        | {
        | "offers":$var_offers
        | }
        """.stripMargin
}
