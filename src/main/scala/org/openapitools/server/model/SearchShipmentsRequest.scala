package org.openapitools.server.model

import java.time.LocalDate

/**
 * Запрос информации об отгрузках.
 *
 * @param dateFrom Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.  for example: ''null''
 * @param dateTo Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.  for example: ''null''
 * @param statuses Список статусов отгрузок. for example: ''null''
 * @param orderIds Список идентификаторов заказов из отгрузок. for example: ''null''
 * @param cancelledOrders Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`.  for example: ''null''
*/
final case class SearchShipmentsRequest (
  dateFrom: LocalDate,
  dateTo: LocalDate,
  statuses: Option[Set[ShipmentStatusType]] = None,
  orderIds: Option[Set[Long]] = None,
  cancelledOrders: Option[Boolean] = None
)

