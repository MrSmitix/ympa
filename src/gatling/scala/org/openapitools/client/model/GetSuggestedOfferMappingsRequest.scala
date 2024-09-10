
package org.openapitools.client.model


case class GetSuggestedOfferMappingsRequest (
    /* Список товаров. */
    _offers: Option[List[SuggestedOfferDTO]]
)
object GetSuggestedOfferMappingsRequest {
    def toStringBody(var_offers: Object) =
        s"""
        | {
        | "offers":$var_offers
        | }
        """.stripMargin
}
