
package org.openapitools.client.model


case class BriefOrderItemDTO (
    /* Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  */
    _id: Option[Long],
    _vat: Option[OrderVatType],
    /* Количество единиц товара. */
    _count: Option[Integer],
    /* Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.  */
    _price: Option[Number],
    /* Название товара. */
    _offerName: Option[String],
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _offerId: Option[String],
    /* Переданные вами коды маркировки. */
    _instances: Option[List[OrderItemInstanceDTO]]
)
object BriefOrderItemDTO {
    def toStringBody(var_id: Object, var_vat: Object, var_count: Object, var_price: Object, var_offerName: Object, var_offerId: Object, var_instances: Object) =
        s"""
        | {
        | "id":$var_id,"vat":$var_vat,"count":$var_count,"price":$var_price,"offerName":$var_offerName,"offerId":$var_offerId,"instances":$var_instances
        | }
        """.stripMargin
}
