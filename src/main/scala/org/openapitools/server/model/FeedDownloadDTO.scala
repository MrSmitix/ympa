package org.openapitools.server.model


/**
 * Информация о последней загрузке прайс-листа.
 *
 * @param status  for example: ''null''
 * @param error  for example: ''null''
*/
final case class FeedDownloadDTO (
  status: Option[FeedStatusType] = None,
  error: Option[FeedDownloadErrorDTO] = None
)

