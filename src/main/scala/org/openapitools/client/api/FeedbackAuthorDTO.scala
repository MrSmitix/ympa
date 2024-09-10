package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedbackAuthorDTO._

case class FeedbackAuthorDTO (
  /* Имя автора отзыва. */
  name: Option[String],
region: Option[RegionDTO])

object FeedbackAuthorDTO {
  import DateTimeCodecs._

  implicit val FeedbackAuthorDTOCodecJson: CodecJson[FeedbackAuthorDTO] = CodecJson.derive[FeedbackAuthorDTO]
  implicit val FeedbackAuthorDTODecoder: EntityDecoder[FeedbackAuthorDTO] = jsonOf[FeedbackAuthorDTO]
  implicit val FeedbackAuthorDTOEncoder: EntityEncoder[FeedbackAuthorDTO] = jsonEncoderOf[FeedbackAuthorDTO]
}
