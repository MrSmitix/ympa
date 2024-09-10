package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
 */
case class ReturnType()

object ReturnType {
    /**
     * Creates the codec for converting ReturnType from and to JSON.
     */
    implicit val decoder: Decoder[ReturnType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ReturnType] = deriveEncoder
}
