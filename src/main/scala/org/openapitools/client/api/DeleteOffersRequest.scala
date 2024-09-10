package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteOffersRequest._

case class DeleteOffersRequest (
  /* Список SKU товаров, которые нужно удалить. */
  offerIds: List[String])

object DeleteOffersRequest {
  import DateTimeCodecs._

  implicit val DeleteOffersRequestCodecJson: CodecJson[DeleteOffersRequest] = CodecJson.derive[DeleteOffersRequest]
  implicit val DeleteOffersRequestDecoder: EntityDecoder[DeleteOffersRequest] = jsonOf[DeleteOffersRequest]
  implicit val DeleteOffersRequestEncoder: EntityEncoder[DeleteOffersRequest] = jsonEncoderOf[DeleteOffersRequest]
}
