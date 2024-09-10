package model

import play.api.libs.json._

/**
  * Ссылка на следующую страницу. 
  * @param nextPageToken Идентификатор следующей страницы результатов.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ForwardScrollingPagerDTO(
  nextPageToken: Option[String]
)

object ForwardScrollingPagerDTO {
  implicit lazy val forwardScrollingPagerDTOJsonFormat: Format[ForwardScrollingPagerDTO] = Json.format[ForwardScrollingPagerDTO]
}

