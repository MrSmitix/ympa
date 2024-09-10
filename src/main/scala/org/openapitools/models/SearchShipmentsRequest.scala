package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime
import org.openapitools.models.ShipmentStatusType

/**
 * Запрос информации об отгрузках.
 * @param dateFrom Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
 * @param dateTo Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
 * @param statuses Список статусов отгрузок.
 * @param orderIds Список идентификаторов заказов из отгрузок.
 * @param cancelledOrders Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. 
 */
case class SearchShipmentsRequest(dateFrom: LocalDateTime,
                dateTo: LocalDateTime,
                statuses: Option[Set[ShipmentStatusType]],
                orderIds: Option[Set[Long]],
                cancelledOrders: Option[Boolean]
                )

object SearchShipmentsRequest {
    /**
     * Creates the codec for converting SearchShipmentsRequest from and to JSON.
     */
    implicit val decoder: Decoder[SearchShipmentsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[SearchShipmentsRequest] = deriveEncoder
}
