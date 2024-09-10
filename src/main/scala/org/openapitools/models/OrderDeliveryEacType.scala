package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип кода подтверждения ЭАПП:  * `MERCHANT_TO_COURIER` — продавец передает код курьеру.  * `COURIER_TO_MERCHANT` — курьер передает код продавцу.  * `CHECKING_BY_MERCHANT` — продавец проверяет код на своей стороне. 
 */
case class OrderDeliveryEacType()

object OrderDeliveryEacType {
    /**
     * Creates the codec for converting OrderDeliveryEacType from and to JSON.
     */
    implicit val decoder: Decoder[OrderDeliveryEacType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderDeliveryEacType] = deriveEncoder
}
