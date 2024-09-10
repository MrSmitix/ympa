package model

import play.api.libs.json._

/**
  * Статистическая информация по отзыву.
  * @param rating Оценка товара.
  * @param commentsCount Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
  * @param recommended Рекомендуют ли этот товар.
  * @param paidAmount Количество баллов Плюса, которое автор получил за отзыв.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GoodsFeedbackStatisticsDTO(
  rating: Int,
  commentsCount: Long,
  recommended: Option[Boolean],
  paidAmount: Option[Long]
)

object GoodsFeedbackStatisticsDTO {
  implicit lazy val goodsFeedbackStatisticsDTOJsonFormat: Format[GoodsFeedbackStatisticsDTO] = Json.format[GoodsFeedbackStatisticsDTO]
}

