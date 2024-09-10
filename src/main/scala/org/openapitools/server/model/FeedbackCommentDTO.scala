package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Комментарий к отзыву на магазин.
 *
 * @param id Идентификатор ответа. for example: ''null''
 * @param parentId Идентификатор родительского ответа. for example: ''null''
 * @param body Текст ответа. for example: ''null''
 * @param createdAt Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  for example: ''null''
 * @param updatedAt Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  for example: ''null''
 * @param author  for example: ''null''
 * @param children Дочерние ответы. for example: ''null''
*/
final case class FeedbackCommentDTO (
  id: Option[Long] = None,
  parentId: Option[Long] = None,
  body: Option[String] = None,
  createdAt: Option[OffsetDateTime] = None,
  updatedAt: Option[OffsetDateTime] = None,
  author: Option[FeedbackCommentAuthorDTO] = None,
  children: Option[Seq[FeedbackCommentDTO]] = None
)

