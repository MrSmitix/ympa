package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SortOrderType._

case class SortOrderType (
  
object SortOrderType {
  import DateTimeCodecs._

  implicit val SortOrderTypeCodecJson: CodecJson[SortOrderType] = CodecJson.derive[SortOrderType]
  implicit val SortOrderTypeDecoder: EntityDecoder[SortOrderType] = jsonOf[SortOrderType]
  implicit val SortOrderTypeEncoder: EntityEncoder[SortOrderType] = jsonEncoderOf[SortOrderType]
}
