package model

import play.api.libs.json._

/**
  * Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.
  * @param notDeletedOfferIds Список SKU товаров, которые не удалось удалить.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class DeleteOffersDTO(
  notDeletedOfferIds: Option[List[String]]
)

object DeleteOffersDTO {
  implicit lazy val deleteOffersDTOJsonFormat: Format[DeleteOffersDTO] = Json.format[DeleteOffersDTO]
}

