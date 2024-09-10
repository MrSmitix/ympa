package org.openapitools.server.model

import java.time.LocalDate

/**
 * Информация о платежном получении.
 *
 * @param id Номер платежного поручения. for example: ''null''
 * @param date Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`.  for example: ''null''
*/
final case class OrdersStatsPaymentOrderDTO (
  id: Option[String] = None,
  date: Option[LocalDate] = None
)

