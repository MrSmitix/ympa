package model

import play.api.libs.json._

/**
  * Отзывы пользователей Яндекс Маркета об указанном магазине.
  * @param feedbackList Список отзывов.  Содержит не более 20 отзывов. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedbackListDTO(
  paging: Option[ScrollingPagerDTO],
  feedbackList: List[FeedbackDTO]
)

object FeedbackListDTO {
  implicit lazy val feedbackListDTOJsonFormat: Format[FeedbackListDTO] = Json.format[FeedbackListDTO]
}

