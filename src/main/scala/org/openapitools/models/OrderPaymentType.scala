package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип оплаты заказа:  * `PREPAID` — оплата при оформлении заказа.  * `POSTPAID` — оплата при получении заказа.  * `UNKNOWN` — неизвестный тип.  Если параметр отсутствует, заказ будет оплачен при получении. 
 */
case class OrderPaymentType()

object OrderPaymentType {
    /**
     * Creates the codec for converting OrderPaymentType from and to JSON.
     */
    implicit val decoder: Decoder[OrderPaymentType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderPaymentType] = deriveEncoder
}
