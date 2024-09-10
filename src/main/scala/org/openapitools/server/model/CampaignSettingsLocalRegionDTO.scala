package org.openapitools.server.model


/**
 * Информация о своем регионе магазина.
 *
 * @param id Идентификатор региона. for example: ''null''
 * @param name Название региона. for example: ''null''
 * @param `type`  for example: ''null''
 * @param deliveryOptionsSource  for example: ''null''
 * @param delivery  for example: ''null''
*/
final case class CampaignSettingsLocalRegionDTO (
  id: Option[Long] = None,
  name: Option[String] = None,
  `type`: Option[RegionType] = None,
  deliveryOptionsSource: Option[CampaignSettingsScheduleSourceType] = None,
  delivery: Option[CampaignSettingsDeliveryDTO] = None
)

