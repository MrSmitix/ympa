package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PriceCompetitivenessType._

case class PriceCompetitivenessType (
  
object PriceCompetitivenessType {
  import DateTimeCodecs._

  implicit val PriceCompetitivenessTypeCodecJson: CodecJson[PriceCompetitivenessType] = CodecJson.derive[PriceCompetitivenessType]
  implicit val PriceCompetitivenessTypeDecoder: EntityDecoder[PriceCompetitivenessType] = jsonOf[PriceCompetitivenessType]
  implicit val PriceCompetitivenessTypeEncoder: EntityEncoder[PriceCompetitivenessType] = jsonEncoderOf[PriceCompetitivenessType]
}
