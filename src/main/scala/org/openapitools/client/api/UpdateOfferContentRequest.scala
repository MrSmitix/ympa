package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateOfferContentRequest._

case class UpdateOfferContentRequest (
  /* Список товаров с указанными характеристиками. */
  offersContent: List[OfferContentDTO])

object UpdateOfferContentRequest {
  import DateTimeCodecs._

  implicit val UpdateOfferContentRequestCodecJson: CodecJson[UpdateOfferContentRequest] = CodecJson.derive[UpdateOfferContentRequest]
  implicit val UpdateOfferContentRequestDecoder: EntityDecoder[UpdateOfferContentRequest] = jsonOf[UpdateOfferContentRequest]
  implicit val UpdateOfferContentRequestEncoder: EntityEncoder[UpdateOfferContentRequest] = jsonEncoderOf[UpdateOfferContentRequest]
}
