package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CurrencyType
import org.openapitools.models.EnrichedModelDTO
import scala.collection.immutable.Seq

/**
 * Ответ на запрос списка предложений для моделей.
 * @param models Список моделей товаров.
 * @param currency 
 * @param regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
 */
case class GetModelsOffersResponse(models: Seq[EnrichedModelDTO],
                currency: Option[CurrencyType],
                regionId: Option[Long]
                )

object GetModelsOffersResponse {
    /**
     * Creates the codec for converting GetModelsOffersResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetModelsOffersResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetModelsOffersResponse] = deriveEncoder
}
