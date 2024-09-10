package org.openapitools.server.model


/**
 * Список отзывов о товарах. 
 *
 * @param feedbacks Список отзывов. for example: ''null''
 * @param paging  for example: ''null''
*/
final case class GoodsFeedbackListDTO (
  feedbacks: Seq[GoodsFeedbackDTO],
  paging: Option[ForwardScrollingPagerDTO] = None
)

