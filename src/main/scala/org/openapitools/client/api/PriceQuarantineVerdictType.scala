package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PriceQuarantineVerdictType._

case class PriceQuarantineVerdictType (
  
object PriceQuarantineVerdictType {
  import DateTimeCodecs._

  implicit val PriceQuarantineVerdictTypeCodecJson: CodecJson[PriceQuarantineVerdictType] = CodecJson.derive[PriceQuarantineVerdictType]
  implicit val PriceQuarantineVerdictTypeDecoder: EntityDecoder[PriceQuarantineVerdictType] = jsonOf[PriceQuarantineVerdictType]
  implicit val PriceQuarantineVerdictTypeEncoder: EntityEncoder[PriceQuarantineVerdictType] = jsonEncoderOf[PriceQuarantineVerdictType]
}
