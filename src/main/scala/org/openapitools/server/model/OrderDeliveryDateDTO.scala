package org.openapitools.server.model

import java.time.LocalDate

/**
 * Информация о новой дате доставки заказа.
 *
 * @param toDate Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`.  for example: ''null''
*/
final case class OrderDeliveryDateDTO (
  toDate: LocalDate
)

