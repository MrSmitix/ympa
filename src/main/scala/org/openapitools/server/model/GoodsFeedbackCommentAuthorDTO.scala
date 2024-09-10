package org.openapitools.server.model


/**
 * Информация об авторе комментария.
 *
 * @param `type`  for example: ''null''
 * @param name Имя автора или название кабинета. for example: ''null''
*/
final case class GoodsFeedbackCommentAuthorDTO (
  `type`: Option[GoodsFeedbackCommentAuthorType] = None,
  name: Option[String] = None
)

