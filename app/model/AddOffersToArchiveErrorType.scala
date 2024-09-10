package model

import play.api.libs.json._

/**
  * Причина, по которой товар не удалось поместить в архив:  * `OFFER_HAS_STOCKS` — товар хранится на складе Маркета. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class AddOffersToArchiveErrorType(
)

object AddOffersToArchiveErrorType {
  implicit lazy val addOffersToArchiveErrorTypeJsonFormat: Format[AddOffersToArchiveErrorType] = Json.format[AddOffersToArchiveErrorType]
}

