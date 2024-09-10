package org.openapitools.server.model

import java.time.LocalDate

/**
 * Запрос информации по индексу качества.
 *
 * @param dateFrom Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты.  for example: ''null''
 * @param dateTo Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты.  for example: ''null''
 * @param campaignIds Список идентификаторов магазинов. for example: ''null''
*/
final case class GetQualityRatingRequest (
  dateFrom: Option[LocalDate] = None,
  dateTo: Option[LocalDate] = None,
  campaignIds: Set[Long]
)

