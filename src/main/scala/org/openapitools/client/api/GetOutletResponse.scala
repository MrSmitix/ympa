package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetOutletResponse._

case class GetOutletResponse (
  outlet: Option[FullOutletDTO])

object GetOutletResponse {
  import DateTimeCodecs._

  implicit val GetOutletResponseCodecJson: CodecJson[GetOutletResponse] = CodecJson.derive[GetOutletResponse]
  implicit val GetOutletResponseDecoder: EntityDecoder[GetOutletResponse] = jsonOf[GetOutletResponse]
  implicit val GetOutletResponseEncoder: EntityEncoder[GetOutletResponse] = jsonEncoderOf[GetOutletResponse]
}
