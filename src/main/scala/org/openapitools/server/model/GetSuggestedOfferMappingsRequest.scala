package org.openapitools.server.model


/**
 * @param offers Список товаров. for example: ''null''
*/
final case class GetSuggestedOfferMappingsRequest (
  offers: Option[Seq[SuggestedOfferDTO]] = None
)

