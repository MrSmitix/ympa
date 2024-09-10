package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetModelsResponse._

case class GetModelsResponse (
  /* Список моделей товаров. */
  models: List[ModelDTO],
currency: Option[CurrencyType],
/* Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  */
  regionId: Option[Long])

object GetModelsResponse {
  import DateTimeCodecs._

  implicit val GetModelsResponseCodecJson: CodecJson[GetModelsResponse] = CodecJson.derive[GetModelsResponse]
  implicit val GetModelsResponseDecoder: EntityDecoder[GetModelsResponse] = jsonOf[GetModelsResponse]
  implicit val GetModelsResponseEncoder: EntityEncoder[GetModelsResponse] = jsonEncoderOf[GetModelsResponse]
}
