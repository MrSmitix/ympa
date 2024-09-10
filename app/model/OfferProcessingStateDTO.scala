package model

import play.api.libs.json._

/**
  * Информация о статусе публикации товара на Маркете.
  * @param notes Причины, по которым товар не прошел модерацию.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferProcessingStateDTO(
  status: Option[OfferProcessingStatusType],
  notes: Option[List[OfferProcessingNoteDTO]]
)

object OfferProcessingStateDTO {
  implicit lazy val offerProcessingStateDTOJsonFormat: Format[OfferProcessingStateDTO] = Json.format[OfferProcessingStateDTO]
}

