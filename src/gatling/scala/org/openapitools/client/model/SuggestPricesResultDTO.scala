
package org.openapitools.client.model


case class SuggestPricesResultDTO (
    /* Список товаров с ценами для продвижения. */
    _offers: List[PriceSuggestOfferDTO]
)
object SuggestPricesResultDTO {
    def toStringBody(var_offers: Object) =
        s"""
        | {
        | "offers":$var_offers
        | }
        """.stripMargin
}
