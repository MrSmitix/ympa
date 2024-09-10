package model

import play.api.libs.json._

/**
  * Подобранные карточки на Маркете.
  * @param offers Список товаров.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetSuggestedOfferMappingsResultDTO(
  offers: List[SuggestedOfferMappingDTO]
)

object GetSuggestedOfferMappingsResultDTO {
  implicit lazy val getSuggestedOfferMappingsResultDTOJsonFormat: Format[GetSuggestedOfferMappingsResultDTO] = Json.format[GetSuggestedOfferMappingsResultDTO]
}

