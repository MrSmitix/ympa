
package org.openapitools.client.model


case class QuantumDTO (
    /* Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать.  */
    _minQuantity: Option[Integer],
    /* На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту.  */
    _stepQuantity: Option[Integer]
)
object QuantumDTO {
    def toStringBody(var_minQuantity: Object, var_stepQuantity: Object) =
        s"""
        | {
        | "minQuantity":$var_minQuantity,"stepQuantity":$var_stepQuantity
        | }
        """.stripMargin
}
