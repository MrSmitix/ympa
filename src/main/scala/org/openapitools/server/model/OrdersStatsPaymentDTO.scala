package org.openapitools.server.model

import java.time.LocalDate

/**
 * Информация о денежных переводах по заказу.
 *
 * @param id Идентификатор денежного перевода. for example: ''null''
 * @param date Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`.  for example: ''null''
 * @param `type`  for example: ''null''
 * @param source  for example: ''null''
 * @param total Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  for example: ''null''
 * @param paymentOrder  for example: ''null''
*/
final case class OrdersStatsPaymentDTO (
  id: Option[String] = None,
  date: Option[LocalDate] = None,
  `type`: Option[OrdersStatsPaymentType] = None,
  source: Option[OrdersStatsPaymentSourceType] = None,
  total: Option[Double] = None,
  paymentOrder: Option[OrdersStatsPaymentOrderDTO] = None
)

