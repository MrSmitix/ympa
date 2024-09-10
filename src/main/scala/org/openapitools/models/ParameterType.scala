package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип данных:  * `TEXT` — текст. * `ENUM` — список возможных значений. * `BOOLEAN` — `true` или `false`. * `NUMERIC` — число. 
 */
case class ParameterType()

object ParameterType {
    /**
     * Creates the codec for converting ParameterType from and to JSON.
     */
    implicit val decoder: Decoder[ParameterType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ParameterType] = deriveEncoder
}
