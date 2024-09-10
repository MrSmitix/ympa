
package org.openapitools.client.model


case class UpdatePriceWithDiscountDTO (
    /* Значение. */
    _value: Number,
    _currencyId: CurrencyType,
    /* Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  */
    _discountBase: Option[Number]
)
object UpdatePriceWithDiscountDTO {
    def toStringBody(var_value: Object, var_currencyId: Object, var_discountBase: Object) =
        s"""
        | {
        | "value":$var_value,"currencyId":$var_currencyId,"discountBase":$var_discountBase
        | }
        """.stripMargin
}
