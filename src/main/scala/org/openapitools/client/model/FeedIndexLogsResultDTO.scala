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


  /**
   * Результат выполнения запроса отчета по индексации прайс-листа.
   */
case class FeedIndexLogsResultDTO(
  feed: Option[FeedIndexLogsFeedDTO] = None,
  /* Список отчетов по индексации прайс-листа. */
  indexLogRecords: Seq[FeedIndexLogsRecordDTO],
  /* Количество отчетов на всех страницах выходных данных. */
  total: Option[Long] = None
)

