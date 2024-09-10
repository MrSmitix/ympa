package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ForwardScrollingPagerDTO._

case class ForwardScrollingPagerDTO (
  /* Идентификатор следующей страницы результатов. */
  nextPageToken: Option[String])

object ForwardScrollingPagerDTO {
  import DateTimeCodecs._

  implicit val ForwardScrollingPagerDTOCodecJson: CodecJson[ForwardScrollingPagerDTO] = CodecJson.derive[ForwardScrollingPagerDTO]
  implicit val ForwardScrollingPagerDTODecoder: EntityDecoder[ForwardScrollingPagerDTO] = jsonOf[ForwardScrollingPagerDTO]
  implicit val ForwardScrollingPagerDTOEncoder: EntityEncoder[ForwardScrollingPagerDTO] = jsonEncoderOf[ForwardScrollingPagerDTO]
}
