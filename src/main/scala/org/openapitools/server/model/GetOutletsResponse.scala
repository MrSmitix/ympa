package org.openapitools.server.model


/**
 * Ответ на запрос информации о точках продаж.
 *
 * @param outlets Информация о точках продаж. for example: ''null''
 * @param paging  for example: ''null''
 * @param pager  for example: ''null''
*/
final case class GetOutletsResponse (
  outlets: Seq[FullOutletDTO],
  paging: Option[ScrollingPagerDTO] = None,
  pager: Option[FlippingPagerDTO] = None
)

