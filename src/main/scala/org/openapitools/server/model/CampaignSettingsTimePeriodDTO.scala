package org.openapitools.server.model


/**
 * Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
 *
 * @param fromDate Формат даты: `ДД-ММ-ГГГГ`.  for example: ''23-09-2022''
 * @param toDate Формат даты: `ДД-ММ-ГГГГ`.  for example: ''23-09-2022''
*/
final case class CampaignSettingsTimePeriodDTO (
  fromDate: Option[String] = None,
  toDate: Option[String] = None
)

