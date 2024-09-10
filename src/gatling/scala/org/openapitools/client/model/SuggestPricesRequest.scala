
package org.openapitools.client.model


case class SuggestPricesRequest (
    /* Список товаров. */
    _offers: List[SuggestOfferPriceDTO]
)
object SuggestPricesRequest {
    def toStringBody(var_offers: Object) =
        s"""
        | {
        | "offers":$var_offers
        | }
        """.stripMargin
}
