package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип оплаты заказа: - `CREDIT` — заказ оформлен в кредит. - `POSTPAID` — заказ оплачен после того, как был получен. - `PREPAID` — заказ оплачен до того, как был получен. 
 */
case class OrdersStatsOrderPaymentType()

object OrdersStatsOrderPaymentType {
    /**
     * Creates the codec for converting OrdersStatsOrderPaymentType from and to JSON.
     */
    implicit val decoder: Decoder[OrdersStatsOrderPaymentType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrdersStatsOrderPaymentType] = deriveEncoder
}
