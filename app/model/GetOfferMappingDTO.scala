package model

import play.api.libs.json._

/**
  * Информация о товаре.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetOfferMappingDTO(
  offer: Option[GetOfferDTO],
  mapping: Option[GetMappingDTO]
)

object GetOfferMappingDTO {
  implicit lazy val getOfferMappingDTOJsonFormat: Format[GetOfferMappingDTO] = Json.format[GetOfferMappingDTO]
}

