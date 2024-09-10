package model

import play.api.libs.json._

/**
  * Возвраты.
  * @param returns Список возвратов.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PagedReturnsDTO(
  paging: Option[ForwardScrollingPagerDTO],
  returns: List[ReturnDTO]
)

object PagedReturnsDTO {
  implicit lazy val pagedReturnsDTOJsonFormat: Format[PagedReturnsDTO] = Json.format[PagedReturnsDTO]
}

