package model

import play.api.libs.json._

/**
  * Товары, которые не удалось восстановить из архива.
  * @param notUnarchivedOfferIds Список товаров, которые не удалось восстановить из архива.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class DeleteOffersFromArchiveDTO(
  notUnarchivedOfferIds: Option[List[String]]
)

object DeleteOffersFromArchiveDTO {
  implicit lazy val deleteOffersFromArchiveDTOJsonFormat: Format[DeleteOffersFromArchiveDTO] = Json.format[DeleteOffersFromArchiveDTO]
}

