package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteOffersFromArchiveRequest._

case class DeleteOffersFromArchiveRequest (
  /* Список товаров, которые нужно восстановить из архива. */
  offerIds: List[String])

object DeleteOffersFromArchiveRequest {
  import DateTimeCodecs._

  implicit val DeleteOffersFromArchiveRequestCodecJson: CodecJson[DeleteOffersFromArchiveRequest] = CodecJson.derive[DeleteOffersFromArchiveRequest]
  implicit val DeleteOffersFromArchiveRequestDecoder: EntityDecoder[DeleteOffersFromArchiveRequest] = jsonOf[DeleteOffersFromArchiveRequest]
  implicit val DeleteOffersFromArchiveRequestEncoder: EntityEncoder[DeleteOffersFromArchiveRequest] = jsonEncoderOf[DeleteOffersFromArchiveRequest]
}
