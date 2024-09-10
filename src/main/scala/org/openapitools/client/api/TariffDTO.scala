package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TariffDTO._

case class TariffDTO (
  `type`: TariffType,
/* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.  */
  percent: Option[BigDecimal],
/* Значение тарифа в рублях. */
  amount: BigDecimal,
/* Параметры расчета тарифа. */
  parameters: List[TariffParameterDTO])

object TariffDTO {
  import DateTimeCodecs._

  implicit val TariffDTOCodecJson: CodecJson[TariffDTO] = CodecJson.derive[TariffDTO]
  implicit val TariffDTODecoder: EntityDecoder[TariffDTO] = jsonOf[TariffDTO]
  implicit val TariffDTOEncoder: EntityEncoder[TariffDTO] = jsonEncoderOf[TariffDTO]
}
