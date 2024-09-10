package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип покупателя:  * `PERSON` — физическое лицо.  * `BUSINESS` — организация. 
 */
case class OrderBuyerType()

object OrderBuyerType {
    /**
     * Creates the codec for converting OrderBuyerType from and to JSON.
     */
    implicit val decoder: Decoder[OrderBuyerType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderBuyerType] = deriveEncoder
}
