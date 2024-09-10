package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ScrollingPagerDTO._

case class ScrollingPagerDTO (
  /* Идентификатор следующей страницы результатов. */
  nextPageToken: Option[String],
/* Идентификатор предыдущей страницы результатов. */
  prevPageToken: Option[String])

object ScrollingPagerDTO {
  import DateTimeCodecs._

  implicit val ScrollingPagerDTOCodecJson: CodecJson[ScrollingPagerDTO] = CodecJson.derive[ScrollingPagerDTO]
  implicit val ScrollingPagerDTODecoder: EntityDecoder[ScrollingPagerDTO] = jsonOf[ScrollingPagerDTO]
  implicit val ScrollingPagerDTOEncoder: EntityEncoder[ScrollingPagerDTO] = jsonEncoderOf[ScrollingPagerDTO]
}
