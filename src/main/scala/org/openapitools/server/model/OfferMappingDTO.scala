package org.openapitools.server.model


/**
 * Информация о текущей карточке товара на Маркете.
 *
 * @param marketSku SKU на Маркете. for example: ''null''
 * @param modelId Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара.  for example: ''null''
 * @param categoryId Идентификатор категории для текущей карточки товара на Маркете. for example: ''null''
*/
final case class OfferMappingDTO (
  marketSku: Option[Long] = None,
  modelId: Option[Long] = None,
  categoryId: Option[Long] = None
)

