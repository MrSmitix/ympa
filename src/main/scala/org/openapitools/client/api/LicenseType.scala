package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LicenseType._

case class LicenseType (
  
object LicenseType {
  import DateTimeCodecs._

  implicit val LicenseTypeCodecJson: CodecJson[LicenseType] = CodecJson.derive[LicenseType]
  implicit val LicenseTypeDecoder: EntityDecoder[LicenseType] = jsonOf[LicenseType]
  implicit val LicenseTypeEncoder: EntityEncoder[LicenseType] = jsonEncoderOf[LicenseType]
}
