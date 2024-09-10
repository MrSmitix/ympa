package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatStatusType._

case class ChatStatusType (
  
object ChatStatusType {
  import DateTimeCodecs._

  implicit val ChatStatusTypeCodecJson: CodecJson[ChatStatusType] = CodecJson.derive[ChatStatusType]
  implicit val ChatStatusTypeDecoder: EntityDecoder[ChatStatusType] = jsonOf[ChatStatusType]
  implicit val ChatStatusTypeEncoder: EntityEncoder[ChatStatusType] = jsonEncoderOf[ChatStatusType]
}
