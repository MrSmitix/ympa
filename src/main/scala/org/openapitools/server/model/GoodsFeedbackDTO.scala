package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Отзыв о товаре.
 *
 * @param feedbackId Идентификатор отзыва.  for example: ''null''
 * @param createdAt Дата и время создания отзыва. for example: ''null''
 * @param needReaction Нужен ли ответ на отзыв. for example: ''null''
 * @param identifiers  for example: ''null''
 * @param author Имя автора отзыва. for example: ''null''
 * @param description  for example: ''null''
 * @param media  for example: ''null''
 * @param statistics  for example: ''null''
*/
final case class GoodsFeedbackDTO (
  feedbackId: Long,
  createdAt: OffsetDateTime,
  needReaction: Boolean,
  identifiers: GoodsFeedbackIdentifiersDTO,
  author: Option[String] = None,
  description: Option[GoodsFeedbackDescriptionDTO] = None,
  media: Option[GoodsFeedbackMediaDTO] = None,
  statistics: GoodsFeedbackStatisticsDTO
)

