
package org.openapitools.client.model


case class OfferSellingProgramDTO (
    _sellingProgram: SellingProgramType,
    _status: OfferSellingProgramStatusType
)
object OfferSellingProgramDTO {
    def toStringBody(var_sellingProgram: Object, var_status: Object) =
        s"""
        | {
        | "sellingProgram":$var_sellingProgram,"status":$var_status
        | }
        """.stripMargin
}
