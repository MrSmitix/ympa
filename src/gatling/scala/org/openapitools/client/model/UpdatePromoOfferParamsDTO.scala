
package org.openapitools.client.model


case class UpdatePromoOfferParamsDTO (
    _discountParams: Option[UpdatePromoOfferDiscountParamsDTO]
)
object UpdatePromoOfferParamsDTO {
    def toStringBody(var_discountParams: Object) =
        s"""
        | {
        | "discountParams":$var_discountParams
        | }
        """.stripMargin
}
