package org.openapitools.server.model


/**
 * Состояние уцененного товара. 
 *
 * @param `type`  for example: ''null''
 * @param quality  for example: ''null''
 * @param reason Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать.  for example: ''null''
*/
final case class OfferConditionDTO (
  `type`: Option[OfferConditionType] = None,
  quality: Option[OfferConditionQualityType] = None,
  reason: Option[String] = None
)

