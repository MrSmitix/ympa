package org.openapitools.server.model


/**
 * Информация о статусе публикации товара на Маркете.
 *
 * @param status  for example: ''null''
 * @param notes Причины, по которым товар не прошел модерацию. for example: ''null''
*/
final case class OfferProcessingStateDTO (
  status: Option[OfferProcessingStatusType] = None,
  notes: Option[Seq[OfferProcessingNoteDTO]] = None
)

