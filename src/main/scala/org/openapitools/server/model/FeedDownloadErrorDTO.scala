package org.openapitools.server.model


/**
 * Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. 
 *
 * @param httpStatusCode HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`.  for example: ''null''
 * @param `type`  for example: ''null''
 * @param description Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`.  for example: ''null''
*/
final case class FeedDownloadErrorDTO (
  httpStatusCode: Option[Int] = None,
  `type`: Option[FeedDownloadErrorType] = None,
  description: Option[String] = None
)

