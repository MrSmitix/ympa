package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetCategoriesMaxSaleQuantumDTO._

case class GetCategoriesMaxSaleQuantumDTO (
  /* Категории и лимит на установку кванта и минимального количества товаров. */
  results: List[MaxSaleQuantumDTO],
/* Ошибки, которые появились из-за переданных категорий. */
  errors: Option[List[CategoryErrorDTO]])

object GetCategoriesMaxSaleQuantumDTO {
  import DateTimeCodecs._

  implicit val GetCategoriesMaxSaleQuantumDTOCodecJson: CodecJson[GetCategoriesMaxSaleQuantumDTO] = CodecJson.derive[GetCategoriesMaxSaleQuantumDTO]
  implicit val GetCategoriesMaxSaleQuantumDTODecoder: EntityDecoder[GetCategoriesMaxSaleQuantumDTO] = jsonOf[GetCategoriesMaxSaleQuantumDTO]
  implicit val GetCategoriesMaxSaleQuantumDTOEncoder: EntityEncoder[GetCategoriesMaxSaleQuantumDTO] = jsonEncoderOf[GetCategoriesMaxSaleQuantumDTO]
}
