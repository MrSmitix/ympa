package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdatePricesRequest._

case class UpdatePricesRequest (
  /* Список товаров. */
  offers: List[OfferPriceDTO])

object UpdatePricesRequest {
  import DateTimeCodecs._

  implicit val UpdatePricesRequestCodecJson: CodecJson[UpdatePricesRequest] = CodecJson.derive[UpdatePricesRequest]
  implicit val UpdatePricesRequestDecoder: EntityDecoder[UpdatePricesRequest] = jsonOf[UpdatePricesRequest]
  implicit val UpdatePricesRequestEncoder: EntityEncoder[UpdatePricesRequest] = jsonEncoderOf[UpdatePricesRequest]
}
