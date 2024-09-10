package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GoodsFeedbackListDTO._

case class GoodsFeedbackListDTO (
  /* Список отзывов. */
  feedbacks: List[GoodsFeedbackDTO],
paging: Option[ForwardScrollingPagerDTO])

object GoodsFeedbackListDTO {
  import DateTimeCodecs._

  implicit val GoodsFeedbackListDTOCodecJson: CodecJson[GoodsFeedbackListDTO] = CodecJson.derive[GoodsFeedbackListDTO]
  implicit val GoodsFeedbackListDTODecoder: EntityDecoder[GoodsFeedbackListDTO] = jsonOf[GoodsFeedbackListDTO]
  implicit val GoodsFeedbackListDTOEncoder: EntityEncoder[GoodsFeedbackListDTO] = jsonEncoderOf[GoodsFeedbackListDTO]
}
