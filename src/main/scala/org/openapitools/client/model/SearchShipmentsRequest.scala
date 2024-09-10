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
import org.openapitools.client.model.ShipmentStatusType._
import scala.collection.immutable.Set

  /**
   * Запрос информации об отгрузках.
   */
case class SearchShipmentsRequest(
  /* Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.  */
  dateFrom: LocalDate,
  /* Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.  */
  dateTo: LocalDate,
  /* Список статусов отгрузок. */
  statuses: Option[Set[ShipmentStatusType]] = None,
  /* Список идентификаторов заказов из отгрузок. */
  orderIds: Option[Set[Long]] = None,
  /* Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`.  */
  cancelledOrders: Option[Boolean] = None
)
