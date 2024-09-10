package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteHiddenOffersRequest._

case class DeleteHiddenOffersRequest (
  /* Список скрытых товаров.  */
  hiddenOffers: List[HiddenOfferDTO])

object DeleteHiddenOffersRequest {
  import DateTimeCodecs._

  implicit val DeleteHiddenOffersRequestCodecJson: CodecJson[DeleteHiddenOffersRequest] = CodecJson.derive[DeleteHiddenOffersRequest]
  implicit val DeleteHiddenOffersRequestDecoder: EntityDecoder[DeleteHiddenOffersRequest] = jsonOf[DeleteHiddenOffersRequest]
  implicit val DeleteHiddenOffersRequestEncoder: EntityEncoder[DeleteHiddenOffersRequest] = jsonEncoderOf[DeleteHiddenOffersRequest]
}
