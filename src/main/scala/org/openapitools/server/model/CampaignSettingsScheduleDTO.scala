package org.openapitools.server.model


/**
 * Расписание работы службы доставки в своем регионе.
 *
 * @param availableOnHolidays Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни.  for example: ''null''
 * @param customHolidays Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. for example: ''null''
 * @param customWorkingDays Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. for example: ''null''
 * @param period  for example: ''null''
 * @param totalHolidays Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. for example: ''null''
 * @param weeklyHolidays Список выходных дней недели и государственных праздников. for example: ''null''
*/
final case class CampaignSettingsScheduleDTO (
  availableOnHolidays: Option[Boolean] = None,
  customHolidays: Seq[String],
  customWorkingDays: Seq[String],
  period: Option[CampaignSettingsTimePeriodDTO] = None,
  totalHolidays: Seq[String],
  weeklyHolidays: Seq[Int]
)

