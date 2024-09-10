package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Значение характеристики.
 * @param id Идентификатор значения.
 * @param value Значение.
 * @param description Описание значения.
 */
case class ParameterValueOptionDTO(id: Long,
                value: String,
                description: Option[String]
                )

object ParameterValueOptionDTO {
    /**
     * Creates the codec for converting ParameterValueOptionDTO from and to JSON.
     */
    implicit val decoder: Decoder[ParameterValueOptionDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ParameterValueOptionDTO] = deriveEncoder
}
