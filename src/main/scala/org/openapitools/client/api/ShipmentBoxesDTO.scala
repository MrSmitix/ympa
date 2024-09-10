package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ShipmentBoxesDTO._

case class ShipmentBoxesDTO (
  /* Список грузовых мест. Маркет определил количество мест по длине этого списка.  */
  boxes: List[ParcelBoxDTO])

object ShipmentBoxesDTO {
  import DateTimeCodecs._

  implicit val ShipmentBoxesDTOCodecJson: CodecJson[ShipmentBoxesDTO] = CodecJson.derive[ShipmentBoxesDTO]
  implicit val ShipmentBoxesDTODecoder: EntityDecoder[ShipmentBoxesDTO] = jsonOf[ShipmentBoxesDTO]
  implicit val ShipmentBoxesDTOEncoder: EntityEncoder[ShipmentBoxesDTO] = jsonEncoderOf[ShipmentBoxesDTO]
}
