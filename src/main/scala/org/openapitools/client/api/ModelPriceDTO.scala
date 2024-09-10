package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ModelPriceDTO._

case class ModelPriceDTO (
  /* Средняя цена предложения для модели в регионе. */
  avg: Option[BigDecimal],
/* Максимальная цена предложения для модели в регионе. */
  max: Option[BigDecimal],
/* Минимальная цена предложения для модели в регионе. */
  min: Option[BigDecimal])

object ModelPriceDTO {
  import DateTimeCodecs._

  implicit val ModelPriceDTOCodecJson: CodecJson[ModelPriceDTO] = CodecJson.derive[ModelPriceDTO]
  implicit val ModelPriceDTODecoder: EntityDecoder[ModelPriceDTO] = jsonOf[ModelPriceDTO]
  implicit val ModelPriceDTOEncoder: EntityEncoder[ModelPriceDTO] = jsonEncoderOf[ModelPriceDTO]
}
