package org.openapitools.server.model


/**
 * Результаты поиска магазинов.
 *
 * @param campaigns Список с информацией по каждому магазину. for example: ''null''
 * @param pager  for example: ''null''
*/
final case class GetCampaignsResponse (
  campaigns: Seq[CampaignDTO],
  pager: Option[FlippingPagerDTO] = None
)

