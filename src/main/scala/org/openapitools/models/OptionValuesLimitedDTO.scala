package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 * @param limitingOptionValueId Идентификатор значения ограничивающей характеристики.
 * @param optionValueIds Идентификаторы допустимых значений ограничиваемой характеристики. 
 */
case class OptionValuesLimitedDTO(limitingOptionValueId: Long,
                optionValueIds: Seq[Long]
                )

object OptionValuesLimitedDTO {
    /**
     * Creates the codec for converting OptionValuesLimitedDTO from and to JSON.
     */
    implicit val decoder: Decoder[OptionValuesLimitedDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OptionValuesLimitedDTO] = deriveEncoder
}
