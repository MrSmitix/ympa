package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ApiResponseStatusType._

case class ApiResponseStatusType (
  
object ApiResponseStatusType {
  import DateTimeCodecs._

  implicit val ApiResponseStatusTypeCodecJson: CodecJson[ApiResponseStatusType] = CodecJson.derive[ApiResponseStatusType]
  implicit val ApiResponseStatusTypeDecoder: EntityDecoder[ApiResponseStatusType] = jsonOf[ApiResponseStatusType]
  implicit val ApiResponseStatusTypeEncoder: EntityEncoder[ApiResponseStatusType] = jsonEncoderOf[ApiResponseStatusType]
}
