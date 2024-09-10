package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PriceSuggestDTO._

case class PriceSuggestDTO (
  `type`: Option[PriceSuggestType],
/* Цена в рублях. */
  price: Option[BigDecimal])

object PriceSuggestDTO {
  import DateTimeCodecs._

  implicit val PriceSuggestDTOCodecJson: CodecJson[PriceSuggestDTO] = CodecJson.derive[PriceSuggestDTO]
  implicit val PriceSuggestDTODecoder: EntityDecoder[PriceSuggestDTO] = jsonOf[PriceSuggestDTO]
  implicit val PriceSuggestDTOEncoder: EntityEncoder[PriceSuggestDTO] = jsonEncoderOf[PriceSuggestDTO]
}
