package org.openapitools.server.model


/**
 * Информация о складе.
 *
 * @param id Идентификатор склада. for example: ''null''
 * @param name Название склада. for example: ''null''
 * @param campaignId Идентификатор кампании в API и идентификатор магазина. for example: ''null''
 * @param express Возможна ли доставка по модели Экспресс. for example: ''null''
 * @param address  for example: ''null''
*/
final case class WarehouseDTO (
  id: Long,
  name: String,
  campaignId: Long,
  express: Boolean,
  address: Option[WarehouseAddressDTO] = None
)

