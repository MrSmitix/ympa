
package org.openapitools.client.model


case class BasePriceDTO (
    /* Значение. */
    _value: Number,
    _currencyId: CurrencyType
)
object BasePriceDTO {
    def toStringBody(var_value: Object, var_currencyId: Object) =
        s"""
        | {
        | "value":$var_value,"currencyId":$var_currencyId
        | }
        """.stripMargin
}
