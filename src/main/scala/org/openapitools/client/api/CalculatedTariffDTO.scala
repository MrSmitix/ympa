package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CalculatedTariffDTO._

case class CalculatedTariffDTO (
  `type`: CalculatedTariffType,
/* Стоимость услуги в рублях. */
  amount: Option[BigDecimal],
/* Параметры расчета тарифа. */
  parameters: List[TariffParameterDTO])

object CalculatedTariffDTO {
  import DateTimeCodecs._

  implicit val CalculatedTariffDTOCodecJson: CodecJson[CalculatedTariffDTO] = CodecJson.derive[CalculatedTariffDTO]
  implicit val CalculatedTariffDTODecoder: EntityDecoder[CalculatedTariffDTO] = jsonOf[CalculatedTariffDTO]
  implicit val CalculatedTariffDTOEncoder: EntityEncoder[CalculatedTariffDTO] = jsonEncoderOf[CalculatedTariffDTO]
}
