package model

import play.api.libs.json._

/**
  * Инструкция по использованию товара. 
  * @param url Ссылка на инструкцию.
  * @param title Название инструкции, которое будет отображаться на карточке товара. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferManualDTO(
  url: String,
  title: Option[String]
)

object OfferManualDTO {
  implicit lazy val offerManualDTOJsonFormat: Format[OfferManualDTO] = Json.format[OfferManualDTO]
}

