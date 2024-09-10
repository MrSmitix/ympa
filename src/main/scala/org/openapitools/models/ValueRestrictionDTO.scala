package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OptionValuesLimitedDTO
import scala.collection.immutable.Seq

/**
 * Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: `S`, `M`, `L`, `44`, `46`, `48`, `42/164`, `46/176`, `44S`.  Если ограничивающая характеристика **размерная сетка** принимает значение `RU`, список возможных значений размера сокращается до `44`, `46`, `48`. 
 * @param limitingParameterId Идентификатор ограничивающей характеристики.
 * @param limitedValues Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
 */
case class ValueRestrictionDTO(limitingParameterId: Long,
                limitedValues: Seq[OptionValuesLimitedDTO]
                )

object ValueRestrictionDTO {
    /**
     * Creates the codec for converting ValueRestrictionDTO from and to JSON.
     */
    implicit val decoder: Decoder[ValueRestrictionDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ValueRestrictionDTO] = deriveEncoder
}
