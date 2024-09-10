package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedIndexLogsIndexType._

case class FeedIndexLogsIndexType (
  
object FeedIndexLogsIndexType {
  import DateTimeCodecs._

  implicit val FeedIndexLogsIndexTypeCodecJson: CodecJson[FeedIndexLogsIndexType] = CodecJson.derive[FeedIndexLogsIndexType]
  implicit val FeedIndexLogsIndexTypeDecoder: EntityDecoder[FeedIndexLogsIndexType] = jsonOf[FeedIndexLogsIndexType]
  implicit val FeedIndexLogsIndexTypeEncoder: EntityEncoder[FeedIndexLogsIndexType] = jsonEncoderOf[FeedIndexLogsIndexType]
}
