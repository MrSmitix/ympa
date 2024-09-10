package model

import play.api.libs.json._

/**
  * Информация о магазине.
  * @param name Название магазина.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedbackShopDTO(
  name: Option[String]
)

object FeedbackShopDTO {
  implicit lazy val feedbackShopDTOJsonFormat: Format[FeedbackShopDTO] = Json.format[FeedbackShopDTO]
}

