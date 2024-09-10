package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetCategoriesMaxSaleQuantumResponse._

case class GetCategoriesMaxSaleQuantumResponse (
  status: Option[ApiResponseStatusType],
/* Категории и лимит на установку кванта и минимального количества товаров. */
  results: List[MaxSaleQuantumDTO],
/* Ошибки, которые появились из-за переданных категорий. */
  errors: Option[List[CategoryErrorDTO]])

object GetCategoriesMaxSaleQuantumResponse {
  import DateTimeCodecs._

  implicit val GetCategoriesMaxSaleQuantumResponseCodecJson: CodecJson[GetCategoriesMaxSaleQuantumResponse] = CodecJson.derive[GetCategoriesMaxSaleQuantumResponse]
  implicit val GetCategoriesMaxSaleQuantumResponseDecoder: EntityDecoder[GetCategoriesMaxSaleQuantumResponse] = jsonOf[GetCategoriesMaxSaleQuantumResponse]
  implicit val GetCategoriesMaxSaleQuantumResponseEncoder: EntityEncoder[GetCategoriesMaxSaleQuantumResponse] = jsonEncoderOf[GetCategoriesMaxSaleQuantumResponse]
}
