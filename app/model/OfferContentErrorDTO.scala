package model

import play.api.libs.json._

/**
  * Текст ошибки.
  * @param parameterId Идентификатор характеристики, с которой связана ошибка.
  * @param message Текст ошибки.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferContentErrorDTO(
  `type`: OfferContentErrorType,
  parameterId: Option[Long],
  message: String
)

object OfferContentErrorDTO {
  implicit lazy val offerContentErrorDTOJsonFormat: Format[OfferContentErrorDTO] = Json.format[OfferContentErrorDTO]
}

