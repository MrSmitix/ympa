package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetOffersResponse._

case class GetOffersResponse (
  /* Список предложений магазина. */
  offers: List[OfferDTO],
pager: Option[FlippingPagerDTO])

object GetOffersResponse {
  import DateTimeCodecs._

  implicit val GetOffersResponseCodecJson: CodecJson[GetOffersResponse] = CodecJson.derive[GetOffersResponse]
  implicit val GetOffersResponseDecoder: EntityDecoder[GetOffersResponse] = jsonOf[GetOffersResponse]
  implicit val GetOffersResponseEncoder: EntityEncoder[GetOffersResponse] = jsonEncoderOf[GetOffersResponse]
}
