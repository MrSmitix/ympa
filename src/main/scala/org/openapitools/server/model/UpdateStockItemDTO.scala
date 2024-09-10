package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Информация об остатках товара. 
 *
 * @param count Количество доступного товара.  for example: ''null''
 * @param updatedAt Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  for example: ''null''
*/
final case class UpdateStockItemDTO (
  count: Long,
  updatedAt: Option[OffsetDateTime] = None
)

