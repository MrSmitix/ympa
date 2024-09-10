package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Способ отгрузки заказов:  * `IMPORT` — вы самостоятельно привозите заказы в выбранный сортировочный центр или пункт приема заказов. * `WITHDRAW` — вы отгружаете заказы со своего склада курьерам Яндекс Маркета. 
 */
case class ShipmentType()

object ShipmentType {
    /**
     * Creates the codec for converting ShipmentType from and to JSON.
     */
    implicit val decoder: Decoder[ShipmentType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ShipmentType] = deriveEncoder
}
