
package org.openapitools.client.model


case class UpdateOfferMappingDTO (
    _offer: UpdateOfferDTO,
    _mapping: Option[UpdateMappingDTO]
)
object UpdateOfferMappingDTO {
    def toStringBody(var_offer: Object, var_mapping: Object) =
        s"""
        | {
        | "offer":$var_offer,"mapping":$var_mapping
        | }
        """.stripMargin
}
