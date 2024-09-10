package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedIndexLogsStatusType._

case class FeedIndexLogsStatusType (
  
object FeedIndexLogsStatusType {
  import DateTimeCodecs._

  implicit val FeedIndexLogsStatusTypeCodecJson: CodecJson[FeedIndexLogsStatusType] = CodecJson.derive[FeedIndexLogsStatusType]
  implicit val FeedIndexLogsStatusTypeDecoder: EntityDecoder[FeedIndexLogsStatusType] = jsonOf[FeedIndexLogsStatusType]
  implicit val FeedIndexLogsStatusTypeEncoder: EntityEncoder[FeedIndexLogsStatusType] = jsonEncoderOf[FeedIndexLogsStatusType]
}
