package org.openapitools.server.model


/**
 * Фильтр запроса комментариев отзыва. 
 *
 * @param feedbackId Идентификатор отзыва.  for example: ''null''
*/
final case class GetGoodsFeedbackCommentsRequest (
  feedbackId: Long
)

