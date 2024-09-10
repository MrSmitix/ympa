package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AddHiddenOffersRequest._

case class AddHiddenOffersRequest (
  /* Список скрытых товаров.  */
  hiddenOffers: List[HiddenOfferDTO])

object AddHiddenOffersRequest {
  import DateTimeCodecs._

  implicit val AddHiddenOffersRequestCodecJson: CodecJson[AddHiddenOffersRequest] = CodecJson.derive[AddHiddenOffersRequest]
  implicit val AddHiddenOffersRequestDecoder: EntityDecoder[AddHiddenOffersRequest] = jsonOf[AddHiddenOffersRequest]
  implicit val AddHiddenOffersRequestEncoder: EntityEncoder[AddHiddenOffersRequest] = jsonEncoderOf[AddHiddenOffersRequest]
}
