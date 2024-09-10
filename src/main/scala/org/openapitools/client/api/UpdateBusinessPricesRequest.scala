package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateBusinessPricesRequest._

case class UpdateBusinessPricesRequest (
  /* Список товаров с ценами. */
  offers: List[UpdateBusinessOfferPriceDTO])

object UpdateBusinessPricesRequest {
  import DateTimeCodecs._

  implicit val UpdateBusinessPricesRequestCodecJson: CodecJson[UpdateBusinessPricesRequest] = CodecJson.derive[UpdateBusinessPricesRequest]
  implicit val UpdateBusinessPricesRequestDecoder: EntityDecoder[UpdateBusinessPricesRequest] = jsonOf[UpdateBusinessPricesRequest]
  implicit val UpdateBusinessPricesRequestEncoder: EntityEncoder[UpdateBusinessPricesRequest] = jsonEncoderOf[UpdateBusinessPricesRequest]
}
