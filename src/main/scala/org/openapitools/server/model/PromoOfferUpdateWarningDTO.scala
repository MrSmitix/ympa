package org.openapitools.server.model


/**
 * Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
 *
 * @param code  for example: ''null''
 * @param campaignIds Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете.  for example: ''null''
*/
final case class PromoOfferUpdateWarningDTO (
  code: PromoOfferUpdateWarningCodeType,
  campaignIds: Option[Seq[Long]] = None
)

