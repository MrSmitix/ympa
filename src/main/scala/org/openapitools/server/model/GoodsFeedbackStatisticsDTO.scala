package org.openapitools.server.model


/**
 * Статистическая информация по отзыву.
 *
 * @param rating Оценка товара. for example: ''null''
 * @param commentsCount Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии.  for example: ''null''
 * @param recommended Рекомендуют ли этот товар. for example: ''null''
 * @param paidAmount Количество баллов Плюса, которое автор получил за отзыв. for example: ''null''
*/
final case class GoodsFeedbackStatisticsDTO (
  rating: Int,
  commentsCount: Long,
  recommended: Option[Boolean] = None,
  paidAmount: Option[Long] = None
)

