package model

import play.api.libs.json._

/**
  * Текстовая часть отзыва.
  * @param advantages Описание плюсов товара в отзыве.
  * @param disadvantages Описание минусов товара в отзыве.
  * @param comment Комментарий в отзыве.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GoodsFeedbackDescriptionDTO(
  advantages: Option[String],
  disadvantages: Option[String],
  comment: Option[String]
)

object GoodsFeedbackDescriptionDTO {
  implicit lazy val goodsFeedbackDescriptionDTOJsonFormat: Format[GoodsFeedbackDescriptionDTO] = Json.format[GoodsFeedbackDescriptionDTO]
}

