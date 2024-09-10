package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetPromoPromocodeInfoDTO._

case class GetPromoPromocodeInfoDTO (
  /* Промокод. */
  promocode: String,
/* Процент скидки по промокоду. */
  discount: Integer)

object GetPromoPromocodeInfoDTO {
  import DateTimeCodecs._

  implicit val GetPromoPromocodeInfoDTOCodecJson: CodecJson[GetPromoPromocodeInfoDTO] = CodecJson.derive[GetPromoPromocodeInfoDTO]
  implicit val GetPromoPromocodeInfoDTODecoder: EntityDecoder[GetPromoPromocodeInfoDTO] = jsonOf[GetPromoPromocodeInfoDTO]
  implicit val GetPromoPromocodeInfoDTOEncoder: EntityEncoder[GetPromoPromocodeInfoDTO] = jsonEncoderOf[GetPromoPromocodeInfoDTO]
}
