
package org.openapitools.client.model

import java.time.OffsetDateTime

case class GetPriceWithVatDTO (
    /* Цена на товар. */
    _value: Option[Number],
    /* Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  */
    _discountBase: Option[Number],
    _currencyId: Option[CurrencyType],
    /* Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете.  */
    _vat: Option[Integer],
    /* Время последнего обновления. */
    _updatedAt: OffsetDateTime
)
object GetPriceWithVatDTO {
    def toStringBody(var_value: Object, var_discountBase: Object, var_currencyId: Object, var_vat: Object, var_updatedAt: Object) =
        s"""
        | {
        | "value":$var_value,"discountBase":$var_discountBase,"currencyId":$var_currencyId,"vat":$var_vat,"updatedAt":$var_updatedAt
        | }
        """.stripMargin
}
