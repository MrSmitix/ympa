package model

import play.api.libs.json._
import java.time.LocalDate
import scala.collection.immutable.Set

/**
  * Запрос информации об отгрузках.
  * @param dateFrom Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
  * @param dateTo Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
  * @param statuses Список статусов отгрузок.
  * @param orderIds Список идентификаторов заказов из отгрузок.
  * @param cancelledOrders Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class SearchShipmentsRequest(
  dateFrom: LocalDate,
  dateTo: LocalDate,
  statuses: Option[Set[ShipmentStatusType]],
  orderIds: Option[Set[Long]],
  cancelledOrders: Option[Boolean]
)

object SearchShipmentsRequest {
  implicit lazy val searchShipmentsRequestJsonFormat: Format[SearchShipmentsRequest] = Json.format[SearchShipmentsRequest]
}

