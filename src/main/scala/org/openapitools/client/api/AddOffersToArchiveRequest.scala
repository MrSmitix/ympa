package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AddOffersToArchiveRequest._

case class AddOffersToArchiveRequest (
  /* Список товаров, которые нужно поместить в архив. */
  offerIds: List[String])

object AddOffersToArchiveRequest {
  import DateTimeCodecs._

  implicit val AddOffersToArchiveRequestCodecJson: CodecJson[AddOffersToArchiveRequest] = CodecJson.derive[AddOffersToArchiveRequest]
  implicit val AddOffersToArchiveRequestDecoder: EntityDecoder[AddOffersToArchiveRequest] = jsonOf[AddOffersToArchiveRequest]
  implicit val AddOffersToArchiveRequestEncoder: EntityEncoder[AddOffersToArchiveRequest] = jsonEncoderOf[AddOffersToArchiveRequest]
}
