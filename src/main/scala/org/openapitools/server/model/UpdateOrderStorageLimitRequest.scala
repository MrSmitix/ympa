package org.openapitools.server.model

import java.time.LocalDate

/**
 * Запрос на обновление срока хранения заказа в ПВЗ.
 *
 * @param newDate Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`.  for example: ''null''
*/
final case class UpdateOrderStorageLimitRequest (
  newDate: LocalDate
)

