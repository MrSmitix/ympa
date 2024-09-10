package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MaxSaleQuantumDTO._

case class MaxSaleQuantumDTO (
  /* Идентификатор категории. */
  id: Long,
/* Название категории. */
  name: Option[String],
/* Лимит на установку кванта и минимального количества товаров. */
  maxSaleQuantum: Option[Integer])

object MaxSaleQuantumDTO {
  import DateTimeCodecs._

  implicit val MaxSaleQuantumDTOCodecJson: CodecJson[MaxSaleQuantumDTO] = CodecJson.derive[MaxSaleQuantumDTO]
  implicit val MaxSaleQuantumDTODecoder: EntityDecoder[MaxSaleQuantumDTO] = jsonOf[MaxSaleQuantumDTO]
  implicit val MaxSaleQuantumDTOEncoder: EntityEncoder[MaxSaleQuantumDTO] = jsonEncoderOf[MaxSaleQuantumDTO]
}
