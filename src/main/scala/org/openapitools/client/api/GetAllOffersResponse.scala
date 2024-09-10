package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetAllOffersResponse._

case class GetAllOffersResponse (
  /* Список предложений магазина. */
  offers: List[OfferDTO])

object GetAllOffersResponse {
  import DateTimeCodecs._

  implicit val GetAllOffersResponseCodecJson: CodecJson[GetAllOffersResponse] = CodecJson.derive[GetAllOffersResponse]
  implicit val GetAllOffersResponseDecoder: EntityDecoder[GetAllOffersResponse] = jsonOf[GetAllOffersResponse]
  implicit val GetAllOffersResponseEncoder: EntityEncoder[GetAllOffersResponse] = jsonEncoderOf[GetAllOffersResponse]
}
