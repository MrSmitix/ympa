package model

import play.api.libs.json._

/**
  * Товары, которые нужно восстановить из архива. 
  * @param offerIds Список товаров, которые нужно восстановить из архива.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class DeleteOffersFromArchiveRequest(
  offerIds: List[String]
)

object DeleteOffersFromArchiveRequest {
  implicit lazy val deleteOffersFromArchiveRequestJsonFormat: Format[DeleteOffersFromArchiveRequest] = Json.format[DeleteOffersFromArchiveRequest]
}

