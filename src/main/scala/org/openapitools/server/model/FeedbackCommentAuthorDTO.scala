package org.openapitools.server.model


/**
 * Информация об авторе комментария.
 *
 * @param `type`  for example: ''null''
 * @param name Имя автора отзыва или название магазина. for example: ''null''
*/
final case class FeedbackCommentAuthorDTO (
  `type`: Option[FeedbackCommentAuthorType] = None,
  name: Option[String] = None
)

