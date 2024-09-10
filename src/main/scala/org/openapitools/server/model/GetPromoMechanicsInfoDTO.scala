package org.openapitools.server.model


/**
 * Информация о типе акции.
 *
 * @param `type`  for example: ''null''
 * @param promocodeInfo  for example: ''null''
*/
final case class GetPromoMechanicsInfoDTO (
  `type`: MechanicsType,
  promocodeInfo: Option[GetPromoPromocodeInfoDTO] = None
)

