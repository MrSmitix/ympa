package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedbackListDTO._

case class FeedbackListDTO (
  paging: Option[ScrollingPagerDTO],
/* Список отзывов.  Содержит не более 20 отзывов.  */
  feedbackList: List[FeedbackDTO])

object FeedbackListDTO {
  import DateTimeCodecs._

  implicit val FeedbackListDTOCodecJson: CodecJson[FeedbackListDTO] = CodecJson.derive[FeedbackListDTO]
  implicit val FeedbackListDTODecoder: EntityDecoder[FeedbackListDTO] = jsonOf[FeedbackListDTO]
  implicit val FeedbackListDTOEncoder: EntityEncoder[FeedbackListDTO] = jsonEncoderOf[FeedbackListDTO]
}
