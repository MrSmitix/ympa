package model

import play.api.libs.json._

/**
  * Информация об ошибке в содержимом прайс-листа. Выводится, если параметр `content status=ERROR`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedContentErrorDTO(
  `type`: Option[FeedContentErrorType]
)

object FeedContentErrorDTO {
  implicit lazy val feedContentErrorDTOJsonFormat: Format[FeedContentErrorDTO] = Json.format[FeedContentErrorDTO]
}

