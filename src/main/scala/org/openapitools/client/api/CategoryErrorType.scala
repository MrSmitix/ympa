package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CategoryErrorType._

case class CategoryErrorType (
  
object CategoryErrorType {
  import DateTimeCodecs._

  implicit val CategoryErrorTypeCodecJson: CodecJson[CategoryErrorType] = CodecJson.derive[CategoryErrorType]
  implicit val CategoryErrorTypeDecoder: EntityDecoder[CategoryErrorType] = jsonOf[CategoryErrorType]
  implicit val CategoryErrorTypeEncoder: EntityEncoder[CategoryErrorType] = jsonEncoderOf[CategoryErrorType]
}
