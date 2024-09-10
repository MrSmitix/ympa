package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Статус отгрузки.
 *
 * @param status  for example: ''null''
 * @param description Описание статуса отгрузки. for example: ''null''
 * @param updateTime Время последнего изменения статуса отгрузки. for example: ''null''
*/
final case class ShipmentStatusChangeDTO (
  status: Option[ShipmentStatusType] = None,
  description: Option[String] = None,
  updateTime: Option[OffsetDateTime] = None
)

