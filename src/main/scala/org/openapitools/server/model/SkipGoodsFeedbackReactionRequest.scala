package org.openapitools.server.model


/**
 * Идентификаторы отзывов.
 *
 * @param feedbackIds Список идентификаторов отзывов, на которые магазин не будет отвечать. for example: ''null''
*/
final case class SkipGoodsFeedbackReactionRequest (
  feedbackIds: Set[Long]
)

