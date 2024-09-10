package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeletePromoOffersRequest._

case class DeletePromoOffersRequest (
  /* Идентификатор акции. */
  promoId: String,
/* Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`. */
  deleteAllOffers: Option[Boolean],
/* Товары, которые нужно убрать из акции. */
  offerIds: Option[List[String]])

object DeletePromoOffersRequest {
  import DateTimeCodecs._

  implicit val DeletePromoOffersRequestCodecJson: CodecJson[DeletePromoOffersRequest] = CodecJson.derive[DeletePromoOffersRequest]
  implicit val DeletePromoOffersRequestDecoder: EntityDecoder[DeletePromoOffersRequest] = jsonOf[DeletePromoOffersRequest]
  implicit val DeletePromoOffersRequestEncoder: EntityEncoder[DeletePromoOffersRequest] = jsonEncoderOf[DeletePromoOffersRequest]
}
