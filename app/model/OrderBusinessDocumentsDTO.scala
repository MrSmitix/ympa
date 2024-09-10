package model

import play.api.libs.json._

/**
  * Информация о документах. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderBusinessDocumentsDTO(
  upd: Option[DocumentDTO],
  ukd: Option[DocumentDTO],
  torgTwelve: Option[DocumentDTO],
  sf: Option[DocumentDTO],
  ksf: Option[DocumentDTO]
)

object OrderBusinessDocumentsDTO {
  implicit lazy val orderBusinessDocumentsDTOJsonFormat: Format[OrderBusinessDocumentsDTO] = Json.format[OrderBusinessDocumentsDTO]
}

