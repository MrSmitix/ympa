package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedStatusType._

case class FeedStatusType (
  
object FeedStatusType {
  import DateTimeCodecs._

  implicit val FeedStatusTypeCodecJson: CodecJson[FeedStatusType] = CodecJson.derive[FeedStatusType]
  implicit val FeedStatusTypeDecoder: EntityDecoder[FeedStatusType] = jsonOf[FeedStatusType]
  implicit val FeedStatusTypeEncoder: EntityEncoder[FeedStatusType] = jsonEncoderOf[FeedStatusType]
}
