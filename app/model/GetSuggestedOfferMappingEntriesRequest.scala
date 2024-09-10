package model

import play.api.libs.json._

/**
  * Запрос рекомендованных карточек товара.
  * @param offers Список товаров.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetSuggestedOfferMappingEntriesRequest(
  offers: List[MappingsOfferDTO]
)

object GetSuggestedOfferMappingEntriesRequest {
  implicit lazy val getSuggestedOfferMappingEntriesRequestJsonFormat: Format[GetSuggestedOfferMappingEntriesRequest] = Json.format[GetSuggestedOfferMappingEntriesRequest]
}

