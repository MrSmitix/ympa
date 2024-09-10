package org.openapitools.server.model


/**
 * Возвраты.
 *
 * @param paging  for example: ''null''
 * @param returns Список возвратов. for example: ''null''
*/
final case class PagedReturnsDTO (
  paging: Option[ForwardScrollingPagerDTO] = None,
  returns: Seq[ReturnDTO]
)

