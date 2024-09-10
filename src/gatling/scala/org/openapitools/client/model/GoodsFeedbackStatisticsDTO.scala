
package org.openapitools.client.model


case class GoodsFeedbackStatisticsDTO (
    /* Оценка товара. */
    _rating: Integer,
    /* Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии.  */
    _commentsCount: Long,
    /* Рекомендуют ли этот товар. */
    _recommended: Option[Boolean],
    /* Количество баллов Плюса, которое автор получил за отзыв. */
    _paidAmount: Option[Long]
)
object GoodsFeedbackStatisticsDTO {
    def toStringBody(var_rating: Object, var_commentsCount: Object, var_recommended: Object, var_paidAmount: Object) =
        s"""
        | {
        | "rating":$var_rating,"commentsCount":$var_commentsCount,"recommended":$var_recommended,"paidAmount":$var_paidAmount
        | }
        """.stripMargin
}
