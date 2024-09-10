package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Способ доставки заказа:  * `DELIVERY` — курьерская доставка.  * `PICKUP` — самовывоз.  * `POST` — почта.  * `DIGITAL` — для цифровых товаров.  * `UNKNOWN` — неизвестный тип. 
 */
case class OrderDeliveryType()

object OrderDeliveryType {
    /**
     * Creates the codec for converting OrderDeliveryType from and to JSON.
     */
    implicit val decoder: Decoder[OrderDeliveryType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderDeliveryType] = deriveEncoder
}
