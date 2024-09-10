package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedbackOrderDTO._

case class FeedbackOrderDTO (
  /* Номер заказа, указанный в отзыве. */
  shopOrderId: Option[String],
delivery: Option[FeedbackDeliveryType])

object FeedbackOrderDTO {
  import DateTimeCodecs._

  implicit val FeedbackOrderDTOCodecJson: CodecJson[FeedbackOrderDTO] = CodecJson.derive[FeedbackOrderDTO]
  implicit val FeedbackOrderDTODecoder: EntityDecoder[FeedbackOrderDTO] = jsonOf[FeedbackOrderDTO]
  implicit val FeedbackOrderDTOEncoder: EntityEncoder[FeedbackOrderDTO] = jsonEncoderOf[FeedbackOrderDTO]
}
