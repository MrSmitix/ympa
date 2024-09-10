package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TrackDTO._

case class TrackDTO (
  /* Трек-код почтового отправления. */
  trackCode: Option[String])

object TrackDTO {
  import DateTimeCodecs._

  implicit val TrackDTOCodecJson: CodecJson[TrackDTO] = CodecJson.derive[TrackDTO]
  implicit val TrackDTODecoder: EntityDecoder[TrackDTO] = jsonOf[TrackDTO]
  implicit val TrackDTOEncoder: EntityEncoder[TrackDTO] = jsonEncoderOf[TrackDTO]
}
