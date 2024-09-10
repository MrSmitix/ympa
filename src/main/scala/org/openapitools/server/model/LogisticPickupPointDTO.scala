package org.openapitools.server.model


/**
 * Описание пункта вывоза для возврата.
 *
 * @param id Идентификатор пункта вывоза. for example: ''null''
 * @param name Название пункта вывоза. for example: ''null''
 * @param address  for example: ''null''
 * @param instruction Дополнительные инструкции к вывозу. for example: ''null''
 * @param `type`  for example: ''null''
 * @param logisticPartnerId Идентификатор логистического партнера, к которому относится логистическая точка. for example: ''null''
*/
final case class LogisticPickupPointDTO (
  id: Option[Long] = None,
  name: Option[String] = None,
  address: Option[PickupAddressDTO] = None,
  instruction: Option[String] = None,
  `type`: Option[LogisticPointType] = None,
  logisticPartnerId: Option[Long] = None
)

