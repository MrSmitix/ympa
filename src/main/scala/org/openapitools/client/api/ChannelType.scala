package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChannelType._

case class ChannelType (
  
object ChannelType {
  import DateTimeCodecs._

  implicit val ChannelTypeCodecJson: CodecJson[ChannelType] = CodecJson.derive[ChannelType]
  implicit val ChannelTypeDecoder: EntityDecoder[ChannelType] = jsonOf[ChannelType]
  implicit val ChannelTypeEncoder: EntityEncoder[ChannelType] = jsonEncoderOf[ChannelType]
}
