
package org.openapitools.client.model


case class PromoOfferParamsDTO (
    _discountParams: Option[PromoOfferDiscountParamsDTO],
    _promocodeParams: Option[PromoOfferPromocodeParamsDTO]
)
object PromoOfferParamsDTO {
    def toStringBody(var_discountParams: Object, var_promocodeParams: Object) =
        s"""
        | {
        | "discountParams":$var_discountParams,"promocodeParams":$var_promocodeParams
        | }
        """.stripMargin
}
