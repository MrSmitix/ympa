package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип денежного перевода: - `PAYMENT` — оплата. - `REFUND` — возврат. 
 */
case class OrdersStatsPaymentType()

object OrdersStatsPaymentType {
    /**
     * Creates the codec for converting OrdersStatsPaymentType from and to JSON.
     */
    implicit val decoder: Decoder[OrdersStatsPaymentType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrdersStatsPaymentType] = deriveEncoder
}
