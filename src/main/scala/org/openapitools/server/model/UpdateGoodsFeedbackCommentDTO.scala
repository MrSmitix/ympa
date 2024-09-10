package org.openapitools.server.model


/**
 * Комментарий к отзыву или другому комментарию.
 *
 * @param id Идентификатор комментария к отзыву.  for example: ''null''
 * @param parentId Идентификатор комментария к отзыву.  for example: ''null''
 * @param text Текст комментария. for example: ''null''
*/
final case class UpdateGoodsFeedbackCommentDTO (
  id: Option[Long] = None,
  parentId: Option[Long] = None,
  text: String
)

