package org.openapitools.server.model


/**
 * Информация о регионе доставки.
 *
 * @param id Идентификатор региона доставки. for example: ''null''
 * @param name Название региона доставки. for example: ''null''
*/
final case class OrdersStatsDeliveryRegionDTO (
  id: Option[Long] = None,
  name: Option[String] = None
)

