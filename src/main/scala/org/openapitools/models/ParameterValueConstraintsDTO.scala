package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Ограничения на значения характеристик.
 * @param minValue Минимальное число.
 * @param maxValue Максимальное число.
 * @param maxLength Максимальная длина текста.
 */
case class ParameterValueConstraintsDTO(minValue: Option[Double],
                maxValue: Option[Double],
                maxLength: Option[Int]
                )

object ParameterValueConstraintsDTO {
    /**
     * Creates the codec for converting ParameterValueConstraintsDTO from and to JSON.
     */
    implicit val decoder: Decoder[ParameterValueConstraintsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ParameterValueConstraintsDTO] = deriveEncoder
}
