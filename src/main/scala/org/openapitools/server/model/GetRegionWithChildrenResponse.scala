package org.openapitools.server.model


/**
 * @param pager  for example: ''null''
 * @param regions  for example: ''null''
*/
final case class GetRegionWithChildrenResponse (
  pager: Option[FlippingPagerDTO] = None,
  regions: Option[RegionDTO] = None
)

