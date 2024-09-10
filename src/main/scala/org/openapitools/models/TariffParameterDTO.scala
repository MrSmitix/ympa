package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Детали расчета конкретной услуги Маркета.
 * @param name Название параметра.
 * @param value Значение параметра.
 */
case class TariffParameterDTO(name: String,
                value: String
                )

object TariffParameterDTO {
    /**
     * Creates the codec for converting TariffParameterDTO from and to JSON.
     */
    implicit val decoder: Decoder[TariffParameterDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[TariffParameterDTO] = deriveEncoder
}
