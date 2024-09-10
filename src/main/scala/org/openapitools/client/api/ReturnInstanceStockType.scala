package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReturnInstanceStockType._

case class ReturnInstanceStockType (
  
object ReturnInstanceStockType {
  import DateTimeCodecs._

  implicit val ReturnInstanceStockTypeCodecJson: CodecJson[ReturnInstanceStockType] = CodecJson.derive[ReturnInstanceStockType]
  implicit val ReturnInstanceStockTypeDecoder: EntityDecoder[ReturnInstanceStockType] = jsonOf[ReturnInstanceStockType]
  implicit val ReturnInstanceStockTypeEncoder: EntityEncoder[ReturnInstanceStockType] = jsonEncoderOf[ReturnInstanceStockType]
}
