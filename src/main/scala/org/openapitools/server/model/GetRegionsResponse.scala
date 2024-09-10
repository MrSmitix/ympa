package org.openapitools.server.model


/**
 * @param regions Регион доставки. for example: ''null''
 * @param paging  for example: ''null''
*/
final case class GetRegionsResponse (
  regions: Seq[RegionDTO],
  paging: Option[ForwardScrollingPagerDTO] = None
)

