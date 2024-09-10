package org.openapitools.server.model


/**
 * @param offerMappings Перечень товаров, которые нужно добавить или обновить. for example: ''null''
 * @param onlyPartnerMediaContent Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`.  for example: ''null''
*/
final case class UpdateOfferMappingsRequest (
  offerMappings: Seq[UpdateOfferMappingDTO],
  onlyPartnerMediaContent: Option[Boolean] = None
)

