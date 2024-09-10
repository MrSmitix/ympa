package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime
import org.openapitools.models.BigDecimal
import org.openapitools.models.OrdersStatsPaymentOrderDTO
import org.openapitools.models.OrdersStatsPaymentSourceType
import org.openapitools.models.OrdersStatsPaymentType

/**
 * Информация о денежных переводах по заказу.
 * @param id Идентификатор денежного перевода.
 * @param date Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. 
 * @param _type 
 * @param source 
 * @param total Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. 
 * @param paymentOrder 
 */
case class OrdersStatsPaymentDTO(id: Option[String],
                date: Option[LocalDateTime],
                _type: Option[OrdersStatsPaymentType],
                source: Option[OrdersStatsPaymentSourceType],
                total: Option[BigDecimal],
                paymentOrder: Option[OrdersStatsPaymentOrderDTO]
                )

object OrdersStatsPaymentDTO {
    /**
     * Creates the codec for converting OrdersStatsPaymentDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrdersStatsPaymentDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrdersStatsPaymentDTO] = deriveEncoder
}
