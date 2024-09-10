package org.openapitools.server.model


/**
 * description.
 *
 * @param bids Список товаров и ставки для продвижения, которые на них нужно установить. for example: ''null''
*/
final case class PutSkuBidsRequest (
  bids: Seq[SkuBidItemDTO]
)

