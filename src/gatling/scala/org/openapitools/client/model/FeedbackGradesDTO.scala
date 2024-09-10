
package org.openapitools.client.model


case class FeedbackGradesDTO (
    /* Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»). */
    _average: Option[Number],
    /* Количество пользователей, считающих отзыв полезным. */
    _agreeCount: Option[Long],
    /* Количество пользователей, считающих отзыв бесполезным. */
    _rejectCount: Option[Long],
    /* Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор.  */
    _factors: List[FeedbackFactorDTO]
)
object FeedbackGradesDTO {
    def toStringBody(var_average: Object, var_agreeCount: Object, var_rejectCount: Object, var_factors: Object) =
        s"""
        | {
        | "average":$var_average,"agreeCount":$var_agreeCount,"rejectCount":$var_rejectCount,"factors":$var_factors
        | }
        """.stripMargin
}
