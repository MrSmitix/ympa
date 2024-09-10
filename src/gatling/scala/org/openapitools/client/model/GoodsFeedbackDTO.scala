
package org.openapitools.client.model

import java.time.OffsetDateTime

case class GoodsFeedbackDTO (
    /* Идентификатор отзыва.  */
    _feedbackId: Long,
    /* Дата и время создания отзыва. */
    _createdAt: OffsetDateTime,
    /* Нужен ли ответ на отзыв. */
    _needReaction: Boolean,
    _identifiers: GoodsFeedbackIdentifiersDTO,
    /* Имя автора отзыва. */
    _author: Option[String],
    _description: Option[GoodsFeedbackDescriptionDTO],
    _media: Option[GoodsFeedbackMediaDTO],
    _statistics: GoodsFeedbackStatisticsDTO
)
object GoodsFeedbackDTO {
    def toStringBody(var_feedbackId: Object, var_createdAt: Object, var_needReaction: Object, var_identifiers: Object, var_author: Object, var_description: Object, var_media: Object, var_statistics: Object) =
        s"""
        | {
        | "feedbackId":$var_feedbackId,"createdAt":$var_createdAt,"needReaction":$var_needReaction,"identifiers":$var_identifiers,"author":$var_author,"description":$var_description,"media":$var_media,"statistics":$var_statistics
        | }
        """.stripMargin
}
