package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderPromoType._

case class OrderPromoType (
  
object OrderPromoType {
  import DateTimeCodecs._

  implicit val OrderPromoTypeCodecJson: CodecJson[OrderPromoType] = CodecJson.derive[OrderPromoType]
  implicit val OrderPromoTypeDecoder: EntityDecoder[OrderPromoType] = jsonOf[OrderPromoType]
  implicit val OrderPromoTypeEncoder: EntityEncoder[OrderPromoType] = jsonEncoderOf[OrderPromoType]
}
