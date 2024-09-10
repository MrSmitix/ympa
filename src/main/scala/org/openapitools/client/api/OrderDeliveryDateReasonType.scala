package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderDeliveryDateReasonType._

case class OrderDeliveryDateReasonType (
  
object OrderDeliveryDateReasonType {
  import DateTimeCodecs._

  implicit val OrderDeliveryDateReasonTypeCodecJson: CodecJson[OrderDeliveryDateReasonType] = CodecJson.derive[OrderDeliveryDateReasonType]
  implicit val OrderDeliveryDateReasonTypeDecoder: EntityDecoder[OrderDeliveryDateReasonType] = jsonOf[OrderDeliveryDateReasonType]
  implicit val OrderDeliveryDateReasonTypeEncoder: EntityEncoder[OrderDeliveryDateReasonType] = jsonEncoderOf[OrderDeliveryDateReasonType]
}
