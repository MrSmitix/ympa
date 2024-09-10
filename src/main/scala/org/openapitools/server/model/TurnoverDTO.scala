package org.openapitools.server.model


/**
 * Информация об оборачиваемости товара.
 *
 * @param turnover  for example: ''null''
 * @param turnoverDays Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html) for example: ''null''
*/
final case class TurnoverDTO (
  turnover: TurnoverType,
  turnoverDays: Option[Double] = None
)

