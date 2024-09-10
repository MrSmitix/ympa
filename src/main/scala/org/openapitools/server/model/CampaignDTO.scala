package org.openapitools.server.model


/**
 * Информация о магазине.
 *
 * @param domain URL магазина. for example: ''null''
 * @param id Идентификатор кампании. for example: ''null''
 * @param clientId Идентификатор плательщика в Яндекс Балансе. for example: ''null''
 * @param business  for example: ''null''
 * @param placementType  for example: ''null''
*/
final case class CampaignDTO (
  domain: Option[String] = None,
  id: Option[Long] = None,
  clientId: Option[Long] = None,
  business: Option[BusinessDTO] = None,
  placementType: Option[PlacementType] = None
)

