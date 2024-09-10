
package org.openapitools.client.model

import java.time.OffsetDateTime

case class GetPriceDTO (
    /* Значение. */
    _value: Number,
    _currencyId: CurrencyType,
    /* Время последнего обновления. */
    _updatedAt: OffsetDateTime
)
object GetPriceDTO {
    def toStringBody(var_value: Object, var_currencyId: Object, var_updatedAt: Object) =
        s"""
        | {
        | "value":$var_value,"currencyId":$var_currencyId,"updatedAt":$var_updatedAt
        | }
        """.stripMargin
}
