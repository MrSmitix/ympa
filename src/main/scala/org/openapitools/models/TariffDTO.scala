package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal
import org.openapitools.models.TariffParameterDTO
import org.openapitools.models.TariffType
import scala.collection.immutable.Seq

/**
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 * @param _type 
 * @param percent {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
 * @param amount Значение тарифа в рублях.
 * @param parameters Параметры расчета тарифа.
 */
case class TariffDTO(_type: TariffType,
                percent: Option[BigDecimal],
                amount: BigDecimal,
                parameters: Seq[TariffParameterDTO]
                )

object TariffDTO {
    /**
     * Creates the codec for converting TariffDTO from and to JSON.
     */
    implicit val decoder: Decoder[TariffDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[TariffDTO] = deriveEncoder
}
