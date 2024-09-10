
package org.openapitools.client.model


case class OrderBuyerDTO (
    /* Идентификатор покупателя. */
    _id: Option[String],
    /* Фамилия покупателя. */
    _lastName: Option[String],
    /* Имя покупателя. */
    _firstName: Option[String],
    /* Отчество покупателя. */
    _middleName: Option[String],
    _type: Option[OrderBuyerType]
)
object OrderBuyerDTO {
    def toStringBody(var_id: Object, var_lastName: Object, var_firstName: Object, var_middleName: Object, var_type: Object) =
        s"""
        | {
        | "id":$var_id,"lastName":$var_lastName,"firstName":$var_firstName,"middleName":$var_middleName,"type":$var_type
        | }
        """.stripMargin
}
