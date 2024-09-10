package org.openapitools.server.model


/**
 * Отзывы пользователей Яндекс Маркета об указанном магазине.
 *
 * @param paging  for example: ''null''
 * @param feedbackList Список отзывов.  Содержит не более 20 отзывов.  for example: ''null''
*/
final case class FeedbackListDTO (
  paging: Option[ScrollingPagerDTO] = None,
  feedbackList: Seq[FeedbackDTO]
)

