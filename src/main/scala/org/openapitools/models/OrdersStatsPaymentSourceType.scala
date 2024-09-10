package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Способ денежного перевода: - `BUYER` — оплата или возврат деньгами. - `CASHBACK` — оплата или возврат баллами Плюса. - `MARKETPLACE` — оплата или возврат купонами. - `SPLIT` — оплата картой по частям (Сплит). 
 */
case class OrdersStatsPaymentSourceType()

object OrdersStatsPaymentSourceType {
    /**
     * Creates the codec for converting OrdersStatsPaymentSourceType from and to JSON.
     */
    implicit val decoder: Decoder[OrdersStatsPaymentSourceType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrdersStatsPaymentSourceType] = deriveEncoder
}
