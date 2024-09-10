package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип сотрудничества со службой доставки в рамках конкретного заказа:  * `SHOP` — магазин работает со службой доставки напрямую или доставляет заказы самостоятельно.  * `YANDEX_MARKET` — магазин работает со службой доставки через Маркет.  * `UNKNOWN` — неизвестный тип. 
 */
case class OrderDeliveryPartnerType()

object OrderDeliveryPartnerType {
    /**
     * Creates the codec for converting OrderDeliveryPartnerType from and to JSON.
     */
    implicit val decoder: Decoder[OrderDeliveryPartnerType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderDeliveryPartnerType] = deriveEncoder
}
