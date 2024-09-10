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

import org.openapitools.client.model.DayOfWeekType._

  /**
   * Расписание работы точки продаж.
   */
case class OutletWorkingScheduleItemDTO(
  startDay: DayOfWeekType,
  endDay: DayOfWeekType,
  /* Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`.  */
  startTime: String,
  /* Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`.  */
  endTime: String
)

object OutletWorkingScheduleItemDTOEnums {

}