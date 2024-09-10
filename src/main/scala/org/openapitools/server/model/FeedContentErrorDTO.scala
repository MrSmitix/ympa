package org.openapitools.server.model


/**
 * Информация об ошибке в содержимом прайс-листа. Выводится, если параметр `content status=ERROR`. 
 *
 * @param `type`  for example: ''null''
*/
final case class FeedContentErrorDTO (
  `type`: Option[FeedContentErrorType] = None
)

