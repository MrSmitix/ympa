package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Возвращенный или невыкупленный товар:  * `REJECTED` — невыкупленный.  * `RETURNED` — возвращенный. 
 */
case class OrderItemStatusType()

object OrderItemStatusType {
    /**
     * Creates the codec for converting OrderItemStatusType from and to JSON.
     */
    implicit val decoder: Decoder[OrderItemStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderItemStatusType] = deriveEncoder
}
