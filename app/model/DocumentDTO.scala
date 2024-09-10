package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Информация о документе.
  * @param number Номер документа.
  * @param date Дата создания документа.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class DocumentDTO(
  status: Option[OrderDocumentStatusType],
  number: Option[String],
  date: Option[LocalDate]
)

object DocumentDTO {
  implicit lazy val documentDTOJsonFormat: Format[DocumentDTO] = Json.format[DocumentDTO]
}

