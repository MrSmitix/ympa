package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CurrencyType
import org.openapitools.models.ModelDTO
import scala.collection.immutable.Seq

/**
 * Ответ на запрос информации о моделях.
 * @param models Список моделей товаров.
 * @param currency 
 * @param regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
 */
case class GetModelsResponse(models: Seq[ModelDTO],
                currency: Option[CurrencyType],
                regionId: Option[Long]
                )

object GetModelsResponse {
    /**
     * Creates the codec for converting GetModelsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetModelsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetModelsResponse] = deriveEncoder
}
