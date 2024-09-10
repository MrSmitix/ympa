package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Заказ, для которого нужно создать чат. 
 * @param orderId Идентификатор заказа на Маркете.
 */
case class CreateChatRequest(orderId: Long
                )

object CreateChatRequest {
    /**
     * Creates the codec for converting CreateChatRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateChatRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateChatRequest] = deriveEncoder
}
