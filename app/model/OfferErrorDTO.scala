package model

import play.api.libs.json._

/**
  * Сообщение об ошибке, связанной с размещением товара.
  * @param message Тип ошибки.
  * @param comment Пояснение.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferErrorDTO(
  message: Option[String],
  comment: Option[String]
)

object OfferErrorDTO {
  implicit lazy val offerErrorDTOJsonFormat: Format[OfferErrorDTO] = Json.format[OfferErrorDTO]
}

