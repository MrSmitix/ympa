package org.openapitools.server.model


/**
 * Информация об отгрузках.
 *
 * @param shipments Список с информацией об отгрузках. for example: ''null''
 * @param paging  for example: ''null''
*/
final case class SearchShipmentsResponseDTO (
  shipments: Seq[ShipmentInfoDTO],
  paging: Option[ForwardScrollingPagerDTO] = None
)

