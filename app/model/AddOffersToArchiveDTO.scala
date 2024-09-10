package model

import play.api.libs.json._

/**
  * Товары, которые не удалось поместить в архив.
  * @param notArchivedOffers Список товаров, которые не удалось поместить в архив.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class AddOffersToArchiveDTO(
  notArchivedOffers: Option[List[AddOffersToArchiveErrorDTO]]
)

object AddOffersToArchiveDTO {
  implicit lazy val addOffersToArchiveDTOJsonFormat: Format[AddOffersToArchiveDTO] = Json.format[AddOffersToArchiveDTO]
}

