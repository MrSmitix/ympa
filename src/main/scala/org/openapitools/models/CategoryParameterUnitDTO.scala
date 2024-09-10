package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.UnitDTO
import scala.collection.immutable.Seq

/**
 * Единицы измерения характеристики товара.
 * @param defaultUnitId Единица измерения по умолчанию.
 * @param units Допустимые единицы измерения.
 */
case class CategoryParameterUnitDTO(defaultUnitId: Long,
                units: Seq[UnitDTO]
                )

object CategoryParameterUnitDTO {
    /**
     * Creates the codec for converting CategoryParameterUnitDTO from and to JSON.
     */
    implicit val decoder: Decoder[CategoryParameterUnitDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[CategoryParameterUnitDTO] = deriveEncoder
}
