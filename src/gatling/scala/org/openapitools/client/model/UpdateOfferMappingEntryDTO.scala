
package org.openapitools.client.model


case class UpdateOfferMappingEntryDTO (
    _mapping: Option[OfferMappingDTO],
    _awaitingModerationMapping: Option[OfferMappingDTO],
    _rejectedMapping: Option[OfferMappingDTO],
    _offer: Option[UpdateMappingsOfferDTO]
)
object UpdateOfferMappingEntryDTO {
    def toStringBody(var_mapping: Object, var_awaitingModerationMapping: Object, var_rejectedMapping: Object, var_offer: Object) =
        s"""
        | {
        | "mapping":$var_mapping,"awaitingModerationMapping":$var_awaitingModerationMapping,"rejectedMapping":$var_rejectedMapping,"offer":$var_offer
        | }
        """.stripMargin
}
