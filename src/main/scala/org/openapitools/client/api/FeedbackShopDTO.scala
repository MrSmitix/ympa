package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedbackShopDTO._

case class FeedbackShopDTO (
  /* Название магазина. */
  name: Option[String])

object FeedbackShopDTO {
  import DateTimeCodecs._

  implicit val FeedbackShopDTOCodecJson: CodecJson[FeedbackShopDTO] = CodecJson.derive[FeedbackShopDTO]
  implicit val FeedbackShopDTODecoder: EntityDecoder[FeedbackShopDTO] = jsonOf[FeedbackShopDTO]
  implicit val FeedbackShopDTOEncoder: EntityEncoder[FeedbackShopDTO] = jsonEncoderOf[FeedbackShopDTO]
}
