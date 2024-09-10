
package org.openapitools.client.model


case class GetPromoPromocodeInfoDTO (
    /* Промокод. */
    _promocode: String,
    /* Процент скидки по промокоду. */
    _discount: Integer
)
object GetPromoPromocodeInfoDTO {
    def toStringBody(var_promocode: Object, var_discount: Object) =
        s"""
        | {
        | "promocode":$var_promocode,"discount":$var_discount
        | }
        """.stripMargin
}
