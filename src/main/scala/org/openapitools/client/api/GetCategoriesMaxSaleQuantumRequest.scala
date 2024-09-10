package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetCategoriesMaxSaleQuantumRequest._

case class GetCategoriesMaxSaleQuantumRequest (
  /* Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий. */
  marketCategoryIds: Set[Long])

object GetCategoriesMaxSaleQuantumRequest {
  import DateTimeCodecs._

  implicit val GetCategoriesMaxSaleQuantumRequestCodecJson: CodecJson[GetCategoriesMaxSaleQuantumRequest] = CodecJson.derive[GetCategoriesMaxSaleQuantumRequest]
  implicit val GetCategoriesMaxSaleQuantumRequestDecoder: EntityDecoder[GetCategoriesMaxSaleQuantumRequest] = jsonOf[GetCategoriesMaxSaleQuantumRequest]
  implicit val GetCategoriesMaxSaleQuantumRequestEncoder: EntityEncoder[GetCategoriesMaxSaleQuantumRequest] = jsonEncoderOf[GetCategoriesMaxSaleQuantumRequest]
}
