package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LicenseCheckStatusType._

case class LicenseCheckStatusType (
  
object LicenseCheckStatusType {
  import DateTimeCodecs._

  implicit val LicenseCheckStatusTypeCodecJson: CodecJson[LicenseCheckStatusType] = CodecJson.derive[LicenseCheckStatusType]
  implicit val LicenseCheckStatusTypeDecoder: EntityDecoder[LicenseCheckStatusType] = jsonOf[LicenseCheckStatusType]
  implicit val LicenseCheckStatusTypeEncoder: EntityEncoder[LicenseCheckStatusType] = jsonEncoderOf[LicenseCheckStatusType]
}
