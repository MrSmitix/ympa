package org.openapitools.server.model


/**
 * Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
 *
 * @param average Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»). for example: ''null''
 * @param agreeCount Количество пользователей, считающих отзыв полезным. for example: ''null''
 * @param rejectCount Количество пользователей, считающих отзыв бесполезным. for example: ''null''
 * @param factors Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор.  for example: ''null''
*/
final case class FeedbackGradesDTO (
  average: Option[Double] = None,
  agreeCount: Option[Long] = None,
  rejectCount: Option[Long] = None,
  factors: Seq[FeedbackFactorDTO]
)

