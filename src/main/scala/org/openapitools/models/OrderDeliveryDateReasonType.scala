package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Причина переноса доставки заказа. Возможные причины изменения даты:   - ```USER_MOVED_DELIVERY_DATES``` — покупатель попросил изменить дату или вы договорились привезти ему заказ раньше изначальной даты. Кроме этого указывается для подтверждения даты доставки товаров на заказ с долгой (31-60 дней) доставкой.   - ```PARTNER_MOVED_DELIVERY_DATES``` — магазин не может доставить заказ в срок. 
 */
case class OrderDeliveryDateReasonType()

object OrderDeliveryDateReasonType {
    /**
     * Creates the codec for converting OrderDeliveryDateReasonType from and to JSON.
     */
    implicit val decoder: Decoder[OrderDeliveryDateReasonType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderDeliveryDateReasonType] = deriveEncoder
}
