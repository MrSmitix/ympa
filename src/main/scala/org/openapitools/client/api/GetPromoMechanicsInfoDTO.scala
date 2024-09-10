package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetPromoMechanicsInfoDTO._

case class GetPromoMechanicsInfoDTO (
  `type`: MechanicsType,
promocodeInfo: Option[GetPromoPromocodeInfoDTO])

object GetPromoMechanicsInfoDTO {
  import DateTimeCodecs._

  implicit val GetPromoMechanicsInfoDTOCodecJson: CodecJson[GetPromoMechanicsInfoDTO] = CodecJson.derive[GetPromoMechanicsInfoDTO]
  implicit val GetPromoMechanicsInfoDTODecoder: EntityDecoder[GetPromoMechanicsInfoDTO] = jsonOf[GetPromoMechanicsInfoDTO]
  implicit val GetPromoMechanicsInfoDTOEncoder: EntityEncoder[GetPromoMechanicsInfoDTO] = jsonEncoderOf[GetPromoMechanicsInfoDTO]
}
