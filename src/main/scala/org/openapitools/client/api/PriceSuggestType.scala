package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PriceSuggestType._

case class PriceSuggestType (
  
object PriceSuggestType {
  import DateTimeCodecs._

  implicit val PriceSuggestTypeCodecJson: CodecJson[PriceSuggestType] = CodecJson.derive[PriceSuggestType]
  implicit val PriceSuggestTypeDecoder: EntityDecoder[PriceSuggestType] = jsonOf[PriceSuggestType]
  implicit val PriceSuggestTypeEncoder: EntityEncoder[PriceSuggestType] = jsonEncoderOf[PriceSuggestType]
}
