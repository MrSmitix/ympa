package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal
import org.openapitools.models.OrdersStatsCommissionType

/**
 * Информация о стоимости услуг.
 * @param _type 
 * @param actual Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. 
 */
case class OrdersStatsCommissionDTO(_type: Option[OrdersStatsCommissionType],
                actual: Option[BigDecimal]
                )

object OrdersStatsCommissionDTO {
    /**
     * Creates the codec for converting OrdersStatsCommissionDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrdersStatsCommissionDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrdersStatsCommissionDTO] = deriveEncoder
}
