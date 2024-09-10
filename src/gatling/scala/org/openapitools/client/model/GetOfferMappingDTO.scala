
package org.openapitools.client.model


case class GetOfferMappingDTO (
    _offer: Option[GetOfferDTO],
    _mapping: Option[GetMappingDTO]
)
object GetOfferMappingDTO {
    def toStringBody(var_offer: Object, var_mapping: Object) =
        s"""
        | {
        | "offer":$var_offer,"mapping":$var_mapping
        | }
        """.stripMargin
}
