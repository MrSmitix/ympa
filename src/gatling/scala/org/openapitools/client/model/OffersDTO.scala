
package org.openapitools.client.model


case class OffersDTO (
    /* Список предложений магазина. */
    _offers: List[OfferDTO]
)
object OffersDTO {
    def toStringBody(var_offers: Object) =
        s"""
        | {
        | "offers":$var_offers
        | }
        """.stripMargin
}
