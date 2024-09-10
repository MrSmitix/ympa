package model

import play.api.libs.json._

/**
  * Товар с соответствующей карточкой на Маркете.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class SuggestedOfferMappingDTO(
  offer: Option[SuggestedOfferDTO],
  mapping: Option[GetMappingDTO]
)

object SuggestedOfferMappingDTO {
  implicit lazy val suggestedOfferMappingDTOJsonFormat: Format[SuggestedOfferMappingDTO] = Json.format[SuggestedOfferMappingDTO]
}

