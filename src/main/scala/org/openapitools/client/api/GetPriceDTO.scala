package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import GetPriceDTO._

case class GetPriceDTO (
  /* Значение. */
  value: BigDecimal,
currencyId: CurrencyType,
/* Время последнего обновления. */
  updatedAt: OffsetDateTime)

object GetPriceDTO {
  import DateTimeCodecs._

  implicit val GetPriceDTOCodecJson: CodecJson[GetPriceDTO] = CodecJson.derive[GetPriceDTO]
  implicit val GetPriceDTODecoder: EntityDecoder[GetPriceDTO] = jsonOf[GetPriceDTO]
  implicit val GetPriceDTOEncoder: EntityEncoder[GetPriceDTO] = jsonEncoderOf[GetPriceDTO]
}
