package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReturnInstanceStatusType._

case class ReturnInstanceStatusType (
  
object ReturnInstanceStatusType {
  import DateTimeCodecs._

  implicit val ReturnInstanceStatusTypeCodecJson: CodecJson[ReturnInstanceStatusType] = CodecJson.derive[ReturnInstanceStatusType]
  implicit val ReturnInstanceStatusTypeDecoder: EntityDecoder[ReturnInstanceStatusType] = jsonOf[ReturnInstanceStatusType]
  implicit val ReturnInstanceStatusTypeEncoder: EntityEncoder[ReturnInstanceStatusType] = jsonEncoderOf[ReturnInstanceStatusType]
}
