package model

import play.api.libs.json._

/**
  * Информация о товарах.
  * @param offerMappings Информация о товарах.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetOfferMappingsResultDTO(
  paging: Option[ScrollingPagerDTO],
  offerMappings: List[GetOfferMappingDTO]
)

object GetOfferMappingsResultDTO {
  implicit lazy val getOfferMappingsResultDTOJsonFormat: Format[GetOfferMappingsResultDTO] = Json.format[GetOfferMappingsResultDTO]
}

