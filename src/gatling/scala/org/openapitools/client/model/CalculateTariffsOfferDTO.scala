
package org.openapitools.client.model


case class CalculateTariffsOfferDTO (
    /* Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  */
    _categoryId: Long,
    /* Цена на товар в рублях. */
    _price: Number,
    /* Длина товара в сантиметрах. */
    _length: Number,
    /* Ширина товара в сантиметрах. */
    _width: Number,
    /* Высота товара в сантиметрах. */
    _height: Number,
    /* Вес товара в килограммах. */
    _weight: Number,
    /* Квант продажи — количество единиц товара в одном товарном предложении. */
    _quantity: Option[Integer]
)
object CalculateTariffsOfferDTO {
    def toStringBody(var_categoryId: Object, var_price: Object, var_length: Object, var_width: Object, var_height: Object, var_weight: Object, var_quantity: Object) =
        s"""
        | {
        | "categoryId":$var_categoryId,"price":$var_price,"length":$var_length,"width":$var_width,"height":$var_height,"weight":$var_weight,"quantity":$var_quantity
        | }
        """.stripMargin
}
