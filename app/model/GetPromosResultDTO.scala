package model

import play.api.libs.json._

/**
  * Информация об акциях Маркета.
  * @param promos Акции Маркета.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetPromosResultDTO(
  promos: List[GetPromoDTO]
)

object GetPromosResultDTO {
  implicit lazy val getPromosResultDTOJsonFormat: Format[GetPromosResultDTO] = Json.format[GetPromosResultDTO]
}

