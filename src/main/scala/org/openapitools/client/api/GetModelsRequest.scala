package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetModelsRequest._

case class GetModelsRequest (
  /* Список моделей. */
  models: List[Long])

object GetModelsRequest {
  import DateTimeCodecs._

  implicit val GetModelsRequestCodecJson: CodecJson[GetModelsRequest] = CodecJson.derive[GetModelsRequest]
  implicit val GetModelsRequestDecoder: EntityDecoder[GetModelsRequest] = jsonOf[GetModelsRequest]
  implicit val GetModelsRequestEncoder: EntityEncoder[GetModelsRequest] = jsonEncoderOf[GetModelsRequest]
}
