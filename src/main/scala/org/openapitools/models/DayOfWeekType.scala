package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * День недели:  * `MONDAY` — понедельник. * `TUESDAY` — вторник. * `WEDNESDAY` — среда. * `THURSDAY` — четверг. * `FRIDAY` — пятница. * `SATURDAY` — суббота. * `SUNDAY` — воскресенье. 
 */
case class DayOfWeekType()

object DayOfWeekType {
    /**
     * Creates the codec for converting DayOfWeekType from and to JSON.
     */
    implicit val decoder: Decoder[DayOfWeekType] = deriveDecoder
    implicit val encoder: ObjectEncoder[DayOfWeekType] = deriveEncoder
}
