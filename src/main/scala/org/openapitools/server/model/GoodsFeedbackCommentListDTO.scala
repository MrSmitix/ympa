package org.openapitools.server.model


/**
 * Комментарии к отзыву.
 *
 * @param comments Список комментариев. for example: ''null''
 * @param paging  for example: ''null''
*/
final case class GoodsFeedbackCommentListDTO (
  comments: Seq[GoodsFeedbackCommentDTO],
  paging: Option[ForwardScrollingPagerDTO] = None
)

