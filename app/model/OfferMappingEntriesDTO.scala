package model

import play.api.libs.json._

/**
  * Информация о товарах в каталоге.
  * @param offerMappingEntries Информация о товарах в каталоге.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferMappingEntriesDTO(
  paging: Option[ScrollingPagerDTO],
  offerMappingEntries: List[OfferMappingEntryDTO]
)

object OfferMappingEntriesDTO {
  implicit lazy val offerMappingEntriesDTOJsonFormat: Format[OfferMappingEntriesDTO] = Json.format[OfferMappingEntriesDTO]
}

