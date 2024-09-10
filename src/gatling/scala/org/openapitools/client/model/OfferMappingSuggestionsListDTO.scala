
package org.openapitools.client.model


case class OfferMappingSuggestionsListDTO (
    /* Список товаров. */
    _offers: List[EnrichedMappingsOfferDTO]
)
object OfferMappingSuggestionsListDTO {
    def toStringBody(var_offers: Object) =
        s"""
        | {
        | "offers":$var_offers
        | }
        """.stripMargin
}
