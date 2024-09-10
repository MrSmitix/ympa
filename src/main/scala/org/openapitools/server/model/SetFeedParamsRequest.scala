package org.openapitools.server.model


/**
 * Запрос на обновление изменение параметров прайс-листа.
 *
 * @param parameters Параметры прайс-листа.  Обязательный параметр.  for example: ''null''
*/
final case class SetFeedParamsRequest (
  parameters: Seq[FeedParameterDTO]
)

