package model

import play.api.libs.json._

/**
  * Товары, которые нужно поместить в архив. 
  * @param offerIds Список товаров, которые нужно поместить в архив.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class AddOffersToArchiveRequest(
  offerIds: List[String]
)

object AddOffersToArchiveRequest {
  implicit lazy val addOffersToArchiveRequestJsonFormat: Format[AddOffersToArchiveRequest] = Json.format[AddOffersToArchiveRequest]
}

