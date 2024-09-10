package model

import play.api.libs.json._

/**
  * Список отзывов о товарах. 
  * @param feedbacks Список отзывов.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GoodsFeedbackListDTO(
  feedbacks: List[GoodsFeedbackDTO],
  paging: Option[ForwardScrollingPagerDTO]
)

object GoodsFeedbackListDTO {
  implicit lazy val goodsFeedbackListDTOJsonFormat: Format[GoodsFeedbackListDTO] = Json.format[GoodsFeedbackListDTO]
}

