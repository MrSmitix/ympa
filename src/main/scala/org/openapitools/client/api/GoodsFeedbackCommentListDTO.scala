package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GoodsFeedbackCommentListDTO._

case class GoodsFeedbackCommentListDTO (
  /* Список комментариев. */
  comments: List[GoodsFeedbackCommentDTO],
paging: Option[ForwardScrollingPagerDTO])

object GoodsFeedbackCommentListDTO {
  import DateTimeCodecs._

  implicit val GoodsFeedbackCommentListDTOCodecJson: CodecJson[GoodsFeedbackCommentListDTO] = CodecJson.derive[GoodsFeedbackCommentListDTO]
  implicit val GoodsFeedbackCommentListDTODecoder: EntityDecoder[GoodsFeedbackCommentListDTO] = jsonOf[GoodsFeedbackCommentListDTO]
  implicit val GoodsFeedbackCommentListDTOEncoder: EntityEncoder[GoodsFeedbackCommentListDTO] = jsonEncoderOf[GoodsFeedbackCommentListDTO]
}
