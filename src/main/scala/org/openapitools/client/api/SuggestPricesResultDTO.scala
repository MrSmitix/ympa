package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SuggestPricesResultDTO._

case class SuggestPricesResultDTO (
  /* Список товаров с ценами для продвижения. */
  offers: List[PriceSuggestOfferDTO])

object SuggestPricesResultDTO {
  import DateTimeCodecs._

  implicit val SuggestPricesResultDTOCodecJson: CodecJson[SuggestPricesResultDTO] = CodecJson.derive[SuggestPricesResultDTO]
  implicit val SuggestPricesResultDTODecoder: EntityDecoder[SuggestPricesResultDTO] = jsonOf[SuggestPricesResultDTO]
  implicit val SuggestPricesResultDTOEncoder: EntityEncoder[SuggestPricesResultDTO] = jsonEncoderOf[SuggestPricesResultDTO]
}
