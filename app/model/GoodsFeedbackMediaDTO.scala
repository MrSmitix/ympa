package model

import play.api.libs.json._

/**
  * Фото и видео.
  * @param photos Ссылки на фото.
  * @param videos Ссылки на видео.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GoodsFeedbackMediaDTO(
  photos: Option[List[String]],
  videos: Option[List[String]]
)

object GoodsFeedbackMediaDTO {
  implicit lazy val goodsFeedbackMediaDTOJsonFormat: Format[GoodsFeedbackMediaDTO] = Json.format[GoodsFeedbackMediaDTO]
}

