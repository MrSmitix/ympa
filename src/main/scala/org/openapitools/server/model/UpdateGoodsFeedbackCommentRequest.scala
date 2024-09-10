package org.openapitools.server.model


/**
 * Комментарий к отзыву.
 *
 * @param feedbackId Идентификатор отзыва.  for example: ''null''
 * @param comment  for example: ''null''
*/
final case class UpdateGoodsFeedbackCommentRequest (
  feedbackId: Long,
  comment: UpdateGoodsFeedbackCommentDTO
)

