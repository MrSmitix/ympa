package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OutletStatusType._

case class OutletStatusType (
  
object OutletStatusType {
  import DateTimeCodecs._

  implicit val OutletStatusTypeCodecJson: CodecJson[OutletStatusType] = CodecJson.derive[OutletStatusType]
  implicit val OutletStatusTypeDecoder: EntityDecoder[OutletStatusType] = jsonOf[OutletStatusType]
  implicit val OutletStatusTypeEncoder: EntityEncoder[OutletStatusType] = jsonEncoderOf[OutletStatusType]
}
