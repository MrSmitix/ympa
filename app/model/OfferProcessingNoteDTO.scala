package model

import play.api.libs.json._

/**
  * Причины, по которым товар не прошел модерацию.
  * @param payload Дополнительная информация о причине отклонения товара. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferProcessingNoteDTO(
  `type`: Option[OfferProcessingNoteType],
  payload: Option[String]
)

object OfferProcessingNoteDTO {
  implicit lazy val offerProcessingNoteDTOJsonFormat: Format[OfferProcessingNoteDTO] = Json.format[OfferProcessingNoteDTO]
}

