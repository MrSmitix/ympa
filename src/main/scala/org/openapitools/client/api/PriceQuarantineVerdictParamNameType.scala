package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PriceQuarantineVerdictParamNameType._

case class PriceQuarantineVerdictParamNameType (
  
object PriceQuarantineVerdictParamNameType {
  import DateTimeCodecs._

  implicit val PriceQuarantineVerdictParamNameTypeCodecJson: CodecJson[PriceQuarantineVerdictParamNameType] = CodecJson.derive[PriceQuarantineVerdictParamNameType]
  implicit val PriceQuarantineVerdictParamNameTypeDecoder: EntityDecoder[PriceQuarantineVerdictParamNameType] = jsonOf[PriceQuarantineVerdictParamNameType]
  implicit val PriceQuarantineVerdictParamNameTypeEncoder: EntityEncoder[PriceQuarantineVerdictParamNameType] = jsonEncoderOf[PriceQuarantineVerdictParamNameType]
}
