package org.openapitools.server.model


/**
 * Причины, по которым товар не прошел модерацию.
 *
 * @param `type`  for example: ''null''
 * @param payload Дополнительная информация о причине отклонения товара.  for example: ''null''
*/
final case class OfferProcessingNoteDTO (
  `type`: Option[OfferProcessingNoteType] = None,
  payload: Option[String] = None
)

