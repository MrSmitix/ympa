package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Изменился ли статус заказа:  * `OK` — статус изменен.  * `ERROR` — статус не изменен. В этом случае появится сообщение об ошибке в параметре `errorDetails`. 
 */
case class OrderUpdateStatusType()

object OrderUpdateStatusType {
    /**
     * Creates the codec for converting OrderUpdateStatusType from and to JSON.
     */
    implicit val decoder: Decoder[OrderUpdateStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderUpdateStatusType] = deriveEncoder
}
