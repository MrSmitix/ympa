
package org.openapitools.client.model


case class SuggestedOfferMappingDTO (
    _offer: Option[SuggestedOfferDTO],
    _mapping: Option[GetMappingDTO]
)
object SuggestedOfferMappingDTO {
    def toStringBody(var_offer: Object, var_mapping: Object) =
        s"""
        | {
        | "offer":$var_offer,"mapping":$var_mapping
        | }
        """.stripMargin
}
