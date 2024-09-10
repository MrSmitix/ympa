package model

import play.api.libs.json._

/**
  * Информация о проверке содержимого прайс-листа, загруженного на Маркет.
  * @param rejectedOffersCount Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. 
  * @param totalOffersCount Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedContentDTO(
  rejectedOffersCount: Option[Long],
  status: Option[FeedStatusType],
  totalOffersCount: Option[Long],
  error: Option[FeedContentErrorDTO]
)

object FeedContentDTO {
  implicit lazy val feedContentDTOJsonFormat: Format[FeedContentDTO] = Json.format[FeedContentDTO]
}

