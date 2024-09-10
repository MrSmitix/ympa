package org.openapitools.server.model


/**
 * Комментарий к отзыву.
 *
 * @param id Идентификатор комментария к отзыву.  for example: ''null''
 * @param text Текст комментария. for example: ''null''
 * @param canModify Может ли продавец изменять комментарий или удалять его. for example: ''null''
 * @param parentId Идентификатор комментария к отзыву.  for example: ''null''
 * @param author  for example: ''null''
 * @param status  for example: ''null''
*/
final case class GoodsFeedbackCommentDTO (
  id: Long,
  text: String,
  canModify: Option[Boolean] = None,
  parentId: Option[Long] = None,
  author: GoodsFeedbackCommentAuthorDTO,
  status: GoodsFeedbackCommentStatusType
)

