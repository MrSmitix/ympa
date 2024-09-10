package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferWeightDimensionsDTO._

case class OfferWeightDimensionsDTO (
  /* Длина упаковки в см.  */
  length: BigDecimal,
/* Ширина упаковки в см.  */
  width: BigDecimal,
/* Высота упаковки в см.  */
  height: BigDecimal,
/* Вес товара в кг с учетом упаковки (брутто).  */
  weight: BigDecimal)

object OfferWeightDimensionsDTO {
  import DateTimeCodecs._

  implicit val OfferWeightDimensionsDTOCodecJson: CodecJson[OfferWeightDimensionsDTO] = CodecJson.derive[OfferWeightDimensionsDTO]
  implicit val OfferWeightDimensionsDTODecoder: EntityDecoder[OfferWeightDimensionsDTO] = jsonOf[OfferWeightDimensionsDTO]
  implicit val OfferWeightDimensionsDTOEncoder: EntityEncoder[OfferWeightDimensionsDTO] = jsonEncoderOf[OfferWeightDimensionsDTO]
}
