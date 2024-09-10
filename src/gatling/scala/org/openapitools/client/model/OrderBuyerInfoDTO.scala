
package org.openapitools.client.model


case class OrderBuyerInfoDTO (
    /* Идентификатор покупателя. */
    _id: Option[String],
    /* Фамилия покупателя. */
    _lastName: Option[String],
    /* Имя покупателя. */
    _firstName: Option[String],
    /* Отчество покупателя. */
    _middleName: Option[String],
    _type: Option[OrderBuyerType],
    /* Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`.  */
    _phone: Option[String]
)
object OrderBuyerInfoDTO {
    def toStringBody(var_id: Object, var_lastName: Object, var_firstName: Object, var_middleName: Object, var_type: Object, var_phone: Object) =
        s"""
        | {
        | "id":$var_id,"lastName":$var_lastName,"firstName":$var_firstName,"middleName":$var_middleName,"type":$var_type,"phone":$var_phone
        | }
        """.stripMargin
}
