
package org.openapitools.client.model


case class FeedbackFactorDTO (
    /* Идентификатор параметра. */
    _id: Option[Long],
    /* Название параметра. Например, `Скорость обработки заказа`. */
    _title: Option[String],
    /* Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`. */
    _description: Option[String],
    /* Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка).  */
    _value: Option[Integer]
)
object FeedbackFactorDTO {
    def toStringBody(var_id: Object, var_title: Object, var_description: Object, var_value: Object) =
        s"""
        | {
        | "id":$var_id,"title":$var_title,"description":$var_description,"value":$var_value
        | }
        """.stripMargin
}
