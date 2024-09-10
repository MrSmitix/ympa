package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RefundStatusType._

case class RefundStatusType (
  
object RefundStatusType {
  import DateTimeCodecs._

  implicit val RefundStatusTypeCodecJson: CodecJson[RefundStatusType] = CodecJson.derive[RefundStatusType]
  implicit val RefundStatusTypeDecoder: EntityDecoder[RefundStatusType] = jsonOf[RefundStatusType]
  implicit val RefundStatusTypeEncoder: EntityEncoder[RefundStatusType] = jsonEncoderOf[RefundStatusType]
}
