package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GoodsStatsWeightDimensionsDTO._

case class GoodsStatsWeightDimensionsDTO (
  /* Длина товара в сантиметрах. */
  length: Option[BigDecimal],
/* Ширина товара в сантиметрах. */
  width: Option[BigDecimal],
/* Высота товара в сантиметрах. */
  height: Option[BigDecimal],
/* Вес товара в килограммах. */
  weight: Option[BigDecimal])

object GoodsStatsWeightDimensionsDTO {
  import DateTimeCodecs._

  implicit val GoodsStatsWeightDimensionsDTOCodecJson: CodecJson[GoodsStatsWeightDimensionsDTO] = CodecJson.derive[GoodsStatsWeightDimensionsDTO]
  implicit val GoodsStatsWeightDimensionsDTODecoder: EntityDecoder[GoodsStatsWeightDimensionsDTO] = jsonOf[GoodsStatsWeightDimensionsDTO]
  implicit val GoodsStatsWeightDimensionsDTOEncoder: EntityEncoder[GoodsStatsWeightDimensionsDTO] = jsonEncoderOf[GoodsStatsWeightDimensionsDTO]
}
