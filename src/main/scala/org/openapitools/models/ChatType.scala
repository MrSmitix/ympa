package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип чата:  * `CHAT` — чат с покупателем. * `ARBITRAGE` — спор. 
 */
case class ChatType()

object ChatType {
    /**
     * Creates the codec for converting ChatType from and to JSON.
     */
    implicit val decoder: Decoder[ChatType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatType] = deriveEncoder
}
