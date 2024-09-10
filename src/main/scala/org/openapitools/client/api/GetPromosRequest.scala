package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetPromosRequest._

case class GetPromosRequest (
  participation: Option[PromoParticipationType],
mechanics: Option[MechanicsType])

object GetPromosRequest {
  import DateTimeCodecs._

  implicit val GetPromosRequestCodecJson: CodecJson[GetPromosRequest] = CodecJson.derive[GetPromosRequest]
  implicit val GetPromosRequestDecoder: EntityDecoder[GetPromosRequest] = jsonOf[GetPromosRequest]
  implicit val GetPromosRequestEncoder: EntityEncoder[GetPromosRequest] = jsonEncoderOf[GetPromosRequest]
}
