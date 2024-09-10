
package org.openapitools.client.model


case class UpdateBusinessPricesRequest (
    /* Список товаров с ценами. */
    _offers: List[UpdateBusinessOfferPriceDTO]
)
object UpdateBusinessPricesRequest {
    def toStringBody(var_offers: Object) =
        s"""
        | {
        | "offers":$var_offers
        | }
        """.stripMargin
}
