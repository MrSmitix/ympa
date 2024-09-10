package org.openapitools.server.model


/**
 * Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (`index-log-record status=ERROR`). 
 *
 * @param httpStatusCode HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`.  for example: ''null''
 * @param `type`  for example: ''null''
 * @param description Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`.  for example: ''null''
*/
final case class FeedIndexLogsErrorDTO (
  httpStatusCode: Option[Int] = None,
  `type`: Option[FeedIndexLogsErrorType] = None,
  description: Option[String] = None
)

