package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BasePriceDTO._

case class BasePriceDTO (
  /* Значение. */
  value: BigDecimal,
currencyId: CurrencyType)

object BasePriceDTO {
  import DateTimeCodecs._

  implicit val BasePriceDTOCodecJson: CodecJson[BasePriceDTO] = CodecJson.derive[BasePriceDTO]
  implicit val BasePriceDTODecoder: EntityDecoder[BasePriceDTO] = jsonOf[BasePriceDTO]
  implicit val BasePriceDTOEncoder: EntityEncoder[BasePriceDTO] = jsonEncoderOf[BasePriceDTO]
}
