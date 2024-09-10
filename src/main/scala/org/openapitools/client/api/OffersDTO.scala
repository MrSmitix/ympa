package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OffersDTO._

case class OffersDTO (
  /* Список предложений магазина. */
  offers: List[OfferDTO])

object OffersDTO {
  import DateTimeCodecs._

  implicit val OffersDTOCodecJson: CodecJson[OffersDTO] = CodecJson.derive[OffersDTO]
  implicit val OffersDTODecoder: EntityDecoder[OffersDTO] = jsonOf[OffersDTO]
  implicit val OffersDTOEncoder: EntityEncoder[OffersDTO] = jsonEncoderOf[OffersDTO]
}
