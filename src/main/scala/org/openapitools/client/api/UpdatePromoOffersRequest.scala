package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdatePromoOffersRequest._

case class UpdatePromoOffersRequest (
  /* Идентификатор акции. */
  promoId: String,
/* Товары, которые необходимо добавить в акцию или цены которых нужно изменить. */
  offers: List[UpdatePromoOfferDTO])

object UpdatePromoOffersRequest {
  import DateTimeCodecs._

  implicit val UpdatePromoOffersRequestCodecJson: CodecJson[UpdatePromoOffersRequest] = CodecJson.derive[UpdatePromoOffersRequest]
  implicit val UpdatePromoOffersRequestDecoder: EntityDecoder[UpdatePromoOffersRequest] = jsonOf[UpdatePromoOffersRequest]
  implicit val UpdatePromoOffersRequestEncoder: EntityEncoder[UpdatePromoOffersRequest] = jsonEncoderOf[UpdatePromoOffersRequest]
}
