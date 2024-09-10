
package org.openapitools.client.model


case class UpdatePricesRequest (
    /* Список товаров. */
    _offers: List[OfferPriceDTO]
)
object UpdatePricesRequest {
    def toStringBody(var_offers: Object) =
        s"""
        | {
        | "offers":$var_offers
        | }
        """.stripMargin
}
