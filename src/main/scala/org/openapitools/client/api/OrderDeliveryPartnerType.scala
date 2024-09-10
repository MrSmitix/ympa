package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderDeliveryPartnerType._

case class OrderDeliveryPartnerType (
  
object OrderDeliveryPartnerType {
  import DateTimeCodecs._

  implicit val OrderDeliveryPartnerTypeCodecJson: CodecJson[OrderDeliveryPartnerType] = CodecJson.derive[OrderDeliveryPartnerType]
  implicit val OrderDeliveryPartnerTypeDecoder: EntityDecoder[OrderDeliveryPartnerType] = jsonOf[OrderDeliveryPartnerType]
  implicit val OrderDeliveryPartnerTypeEncoder: EntityEncoder[OrderDeliveryPartnerType] = jsonEncoderOf[OrderDeliveryPartnerType]
}
