/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import java.time.LocalDate

  /**
   * Данные, необходимые для генерации отчета.
   */
case class GeneratePricesReportRequest(
  /* Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`.  */
  businessId: Option[Long] = None,
  /* Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно.  */
  campaignId: Option[Long] = None,
  /* Фильтр по категориям на Маркете. */
  categoryIds: Option[Seq[Long]] = None,
  /* Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`.  */
  creationDateFrom: Option[LocalDate] = None,
  /* Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`.  */
  creationDateTo: Option[LocalDate] = None
)

