package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип акции:  * `DIRECT_DISCOUNT` — прямая скидка.  * `BLUE_FLASH` — флеш-акция.  * `MARKET_PROMOCODE` — скидка по промокоду. 
 */
case class MechanicsType()

object MechanicsType {
    /**
     * Creates the codec for converting MechanicsType from and to JSON.
     */
    implicit val decoder: Decoder[MechanicsType] = deriveDecoder
    implicit val encoder: ObjectEncoder[MechanicsType] = deriveEncoder
}
