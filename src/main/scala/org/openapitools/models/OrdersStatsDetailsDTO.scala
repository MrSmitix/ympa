package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime
import org.openapitools.models.OrdersStatsItemStatusType
import org.openapitools.models.OrdersStatsStockType

/**
 * Информация об удалении товара из заказа.
 * @param itemStatus 
 * @param itemCount Количество товара со статусом, указанном в параметре `itemStatus`.
 * @param updateDate Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. 
 * @param stockType 
 */
case class OrdersStatsDetailsDTO(itemStatus: Option[OrdersStatsItemStatusType],
                itemCount: Option[Long],
                updateDate: Option[LocalDateTime],
                stockType: Option[OrdersStatsStockType]
                )

object OrdersStatsDetailsDTO {
    /**
     * Creates the codec for converting OrdersStatsDetailsDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrdersStatsDetailsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrdersStatsDetailsDTO] = deriveEncoder
}
