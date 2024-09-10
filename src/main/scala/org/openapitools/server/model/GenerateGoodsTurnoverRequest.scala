package org.openapitools.server.model

import java.time.LocalDate

/**
 * Данные, необходимые для генерации отчета. 
 *
 * @param campaignId Идентификатор кампании. for example: ''null''
 * @param date Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата. for example: ''null''
*/
final case class GenerateGoodsTurnoverRequest (
  campaignId: Long,
  date: Option[LocalDate] = None
)

