package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal
import org.openapitools.models.CalculatedTariffType
import org.openapitools.models.TariffParameterDTO
import scala.collection.immutable.Seq

/**
 * Информация об услугах Маркета.
 * @param _type 
 * @param amount Стоимость услуги в рублях.
 * @param parameters Параметры расчета тарифа.
 */
case class CalculatedTariffDTO(_type: CalculatedTariffType,
                amount: Option[BigDecimal],
                parameters: Seq[TariffParameterDTO]
                )

object CalculatedTariffDTO {
    /**
     * Creates the codec for converting CalculatedTariffDTO from and to JSON.
     */
    implicit val decoder: Decoder[CalculatedTariffDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[CalculatedTariffDTO] = deriveEncoder
}
