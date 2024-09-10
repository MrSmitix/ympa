
package org.openapitools.client.model


case class OfferMappingInfoDTO (
    _mapping: Option[OfferMappingDTO],
    _awaitingModerationMapping: Option[OfferMappingDTO],
    _rejectedMapping: Option[OfferMappingDTO]
)
object OfferMappingInfoDTO {
    def toStringBody(var_mapping: Object, var_awaitingModerationMapping: Object, var_rejectedMapping: Object) =
        s"""
        | {
        | "mapping":$var_mapping,"awaitingModerationMapping":$var_awaitingModerationMapping,"rejectedMapping":$var_rejectedMapping
        | }
        """.stripMargin
}
