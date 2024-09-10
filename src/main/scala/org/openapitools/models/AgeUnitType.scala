package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Единицы измерения возраста:  * `YEAR` — год. * `MONTH` — месяц. 
 */
case class AgeUnitType()

object AgeUnitType {
    /**
     * Creates the codec for converting AgeUnitType from and to JSON.
     */
    implicit val decoder: Decoder[AgeUnitType] = deriveDecoder
    implicit val encoder: ObjectEncoder[AgeUnitType] = deriveEncoder
}
