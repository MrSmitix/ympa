package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Единица измерения времени:  * `HOUR` — час. * `DAY` — сутки. * `WEEK` — неделя. * `MONTH` — месяц. * `YEAR` — год. 
 */
case class TimeUnitType()

object TimeUnitType {
    /**
     * Creates the codec for converting TimeUnitType from and to JSON.
     */
    implicit val decoder: Decoder[TimeUnitType] = deriveDecoder
    implicit val encoder: ObjectEncoder[TimeUnitType] = deriveEncoder
}
