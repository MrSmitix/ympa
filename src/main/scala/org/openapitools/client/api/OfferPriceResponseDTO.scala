package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import OfferPriceResponseDTO._

case class OfferPriceResponseDTO (
  /* Идентификатор предложения из прайс-листа. */
  id: Option[String],
price: Option[PriceDTO],
/* SKU на Маркете. */
  marketSku: Option[Long],
/* Дата и время последнего обновления цены на товар. */
  updatedAt: Option[OffsetDateTime])

object OfferPriceResponseDTO {
  import DateTimeCodecs._

  implicit val OfferPriceResponseDTOCodecJson: CodecJson[OfferPriceResponseDTO] = CodecJson.derive[OfferPriceResponseDTO]
  implicit val OfferPriceResponseDTODecoder: EntityDecoder[OfferPriceResponseDTO] = jsonOf[OfferPriceResponseDTO]
  implicit val OfferPriceResponseDTOEncoder: EntityEncoder[OfferPriceResponseDTO] = jsonEncoderOf[OfferPriceResponseDTO]
}
