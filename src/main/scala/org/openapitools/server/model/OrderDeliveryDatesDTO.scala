package org.openapitools.server.model


/**
 * Диапазон дат доставки.
 *
 * @param fromDate Формат даты: `ДД-ММ-ГГГГ`.  for example: ''23-09-2022''
 * @param toDate Формат даты: `ДД-ММ-ГГГГ`.  for example: ''23-09-2022''
 * @param fromTime Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`.  for example: ''null''
 * @param toTime Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`.  for example: ''null''
 * @param realDeliveryDate Формат даты: `ДД-ММ-ГГГГ`.  for example: ''23-09-2022''
*/
final case class OrderDeliveryDatesDTO (
  fromDate: Option[String] = None,
  toDate: Option[String] = None,
  fromTime: Option[String] = None,
  toTime: Option[String] = None,
  realDeliveryDate: Option[String] = None
)

