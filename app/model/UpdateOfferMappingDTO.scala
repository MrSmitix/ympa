package model

import play.api.libs.json._

/**
  * Информация о товаре.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateOfferMappingDTO(
  offer: UpdateOfferDTO,
  mapping: Option[UpdateMappingDTO]
)

object UpdateOfferMappingDTO {
  implicit lazy val updateOfferMappingDTOJsonFormat: Format[UpdateOfferMappingDTO] = Json.format[UpdateOfferMappingDTO]
}

