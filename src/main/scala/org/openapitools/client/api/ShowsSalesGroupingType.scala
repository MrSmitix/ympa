package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ShowsSalesGroupingType._

case class ShowsSalesGroupingType (
  
object ShowsSalesGroupingType {
  import DateTimeCodecs._

  implicit val ShowsSalesGroupingTypeCodecJson: CodecJson[ShowsSalesGroupingType] = CodecJson.derive[ShowsSalesGroupingType]
  implicit val ShowsSalesGroupingTypeDecoder: EntityDecoder[ShowsSalesGroupingType] = jsonOf[ShowsSalesGroupingType]
  implicit val ShowsSalesGroupingTypeEncoder: EntityEncoder[ShowsSalesGroupingType] = jsonEncoderOf[ShowsSalesGroupingType]
}
