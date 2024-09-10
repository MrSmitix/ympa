
package org.openapitools.client.model


case class GetSuggestedOfferMappingsResultDTO (
    /* Список товаров. */
    _offers: List[SuggestedOfferMappingDTO]
)
object GetSuggestedOfferMappingsResultDTO {
    def toStringBody(var_offers: Object) =
        s"""
        | {
        | "offers":$var_offers
        | }
        """.stripMargin
}
