package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime
import java.time.ZonedDateTime
import org.openapitools.models.OrderStatsStatusType
import org.openapitools.models.OrdersStatsCommissionDTO
import org.openapitools.models.OrdersStatsDeliveryRegionDTO
import org.openapitools.models.OrdersStatsItemDTO
import org.openapitools.models.OrdersStatsOrderPaymentType
import org.openapitools.models.OrdersStatsPaymentDTO
import scala.collection.immutable.Seq

/**
 * Информация о заказе.
 * @param id Идентификатор заказа.
 * @param creationDate Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
 * @param statusUpdateDate Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). 
 * @param status 
 * @param partnerOrderId Идентификатор заказа в информационной системе магазина.
 * @param paymentType 
 * @param fake Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
 * @param deliveryRegion 
 * @param items Список товаров в заказе после возможных изменений.
 * @param initialItems Список товаров в заказе до изменений.
 * @param payments Информация о денежных переводах по заказу.
 * @param commissions Информация о комиссиях за заказ.
 */
case class OrdersStatsOrderDTO(id: Option[Long],
                creationDate: Option[LocalDateTime],
                statusUpdateDate: Option[ZonedDateTime],
                status: Option[OrderStatsStatusType],
                partnerOrderId: Option[String],
                paymentType: Option[OrdersStatsOrderPaymentType],
                fake: Option[Boolean],
                deliveryRegion: Option[OrdersStatsDeliveryRegionDTO],
                items: Seq[OrdersStatsItemDTO],
                initialItems: Option[Seq[OrdersStatsItemDTO]],
                payments: Seq[OrdersStatsPaymentDTO],
                commissions: Seq[OrdersStatsCommissionDTO]
                )

object OrdersStatsOrderDTO {
    /**
     * Creates the codec for converting OrdersStatsOrderDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrdersStatsOrderDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrdersStatsOrderDTO] = deriveEncoder
}
