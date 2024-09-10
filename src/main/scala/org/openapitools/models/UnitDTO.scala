package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Единица измерения.
 * @param id Идентификатор единицы измерения.
 * @param name Сокращенное название единицы измерения.
 * @param fullName Полное название единицы измерения.
 */
case class UnitDTO(id: Long,
                name: String,
                fullName: String
                )

object UnitDTO {
    /**
     * Creates the codec for converting UnitDTO from and to JSON.
     */
    implicit val decoder: Decoder[UnitDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[UnitDTO] = deriveEncoder
}
