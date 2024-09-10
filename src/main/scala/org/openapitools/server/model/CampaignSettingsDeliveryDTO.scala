package org.openapitools.server.model


/**
 * Информация о доставке в своем регионе магазина.
 *
 * @param schedule  for example: ''null''
*/
final case class CampaignSettingsDeliveryDTO (
  schedule: Option[CampaignSettingsScheduleDTO] = None
)

