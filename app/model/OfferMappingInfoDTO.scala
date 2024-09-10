package model

import play.api.libs.json._

/**
  * Информация о карточке товара.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferMappingInfoDTO(
  mapping: Option[OfferMappingDTO],
  awaitingModerationMapping: Option[OfferMappingDTO],
  rejectedMapping: Option[OfferMappingDTO]
)

object OfferMappingInfoDTO {
  implicit lazy val offerMappingInfoDTOJsonFormat: Format[OfferMappingInfoDTO] = Json.format[OfferMappingInfoDTO]
}

