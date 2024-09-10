package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetPromoOffersRequest._

case class GetPromoOffersRequest (
  /* Идентификатор акции. */
  promoId: String,
statusType: Option[PromoOfferParticipationStatusFilterType])

object GetPromoOffersRequest {
  import DateTimeCodecs._

  implicit val GetPromoOffersRequestCodecJson: CodecJson[GetPromoOffersRequest] = CodecJson.derive[GetPromoOffersRequest]
  implicit val GetPromoOffersRequestDecoder: EntityDecoder[GetPromoOffersRequest] = jsonOf[GetPromoOffersRequest]
  implicit val GetPromoOffersRequestEncoder: EntityEncoder[GetPromoOffersRequest] = jsonEncoderOf[GetPromoOffersRequest]
}
