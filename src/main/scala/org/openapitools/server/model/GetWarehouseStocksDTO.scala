package org.openapitools.server.model


/**
 * Список складов с информацией об остатках на каждом из них.
 *
 * @param paging  for example: ''null''
 * @param warehouses Страница списка складов. for example: ''null''
*/
final case class GetWarehouseStocksDTO (
  paging: Option[ScrollingPagerDTO] = None,
  warehouses: Seq[WarehouseOffersDTO]
)

