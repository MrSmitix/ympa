package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SetOrderShipmentBoxesRequest._

case class SetOrderShipmentBoxesRequest (
  /* Список грузовых мест. Маркет определяет количество мест по длине этого списка. */
  boxes: List[ParcelBoxDTO])

object SetOrderShipmentBoxesRequest {
  import DateTimeCodecs._

  implicit val SetOrderShipmentBoxesRequestCodecJson: CodecJson[SetOrderShipmentBoxesRequest] = CodecJson.derive[SetOrderShipmentBoxesRequest]
  implicit val SetOrderShipmentBoxesRequestDecoder: EntityDecoder[SetOrderShipmentBoxesRequest] = jsonOf[SetOrderShipmentBoxesRequest]
  implicit val SetOrderShipmentBoxesRequestEncoder: EntityEncoder[SetOrderShipmentBoxesRequest] = jsonEncoderOf[SetOrderShipmentBoxesRequest]
}
