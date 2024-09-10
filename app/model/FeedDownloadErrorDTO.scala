package model

import play.api.libs.json._

/**
  * Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. 
  * @param httpStatusCode HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
  * @param description Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedDownloadErrorDTO(
  httpStatusCode: Option[Int],
  `type`: Option[FeedDownloadErrorType],
  description: Option[String]
)

object FeedDownloadErrorDTO {
  implicit lazy val feedDownloadErrorDTOJsonFormat: Format[FeedDownloadErrorDTO] = Json.format[FeedDownloadErrorDTO]
}

