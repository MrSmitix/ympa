
package org.openapitools.client.model


case class GetSuggestedOfferMappingEntriesRequest (
    /* Список товаров. */
    _offers: List[MappingsOfferDTO]
)
object GetSuggestedOfferMappingEntriesRequest {
    def toStringBody(var_offers: Object) =
        s"""
        | {
        | "offers":$var_offers
        | }
        """.stripMargin
}
