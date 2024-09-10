package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetModelsOffersResponse._

case class GetModelsOffersResponse (
  /* Список моделей товаров. */
  models: List[EnrichedModelDTO],
currency: Option[CurrencyType],
/* Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  */
  regionId: Option[Long])

object GetModelsOffersResponse {
  import DateTimeCodecs._

  implicit val GetModelsOffersResponseCodecJson: CodecJson[GetModelsOffersResponse] = CodecJson.derive[GetModelsOffersResponse]
  implicit val GetModelsOffersResponseDecoder: EntityDecoder[GetModelsOffersResponse] = jsonOf[GetModelsOffersResponse]
  implicit val GetModelsOffersResponseEncoder: EntityEncoder[GetModelsOffersResponse] = jsonEncoderOf[GetModelsOffersResponse]
}
