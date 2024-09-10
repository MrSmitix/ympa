package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SearchModelsResponse._

case class SearchModelsResponse (
  /* Список моделей товаров. */
  models: List[ModelDTO],
currency: Option[CurrencyType],
/* Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  */
  regionId: Option[Long],
pager: Option[FlippingPagerDTO])

object SearchModelsResponse {
  import DateTimeCodecs._

  implicit val SearchModelsResponseCodecJson: CodecJson[SearchModelsResponse] = CodecJson.derive[SearchModelsResponse]
  implicit val SearchModelsResponseDecoder: EntityDecoder[SearchModelsResponse] = jsonOf[SearchModelsResponse]
  implicit val SearchModelsResponseEncoder: EntityEncoder[SearchModelsResponse] = jsonEncoderOf[SearchModelsResponse]
}
