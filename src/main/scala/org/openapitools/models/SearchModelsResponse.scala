package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CurrencyType
import org.openapitools.models.FlippingPagerDTO
import org.openapitools.models.ModelDTO
import scala.collection.immutable.Seq

/**
 * 
 * @param models Список моделей товаров.
 * @param currency 
 * @param regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
 * @param pager 
 */
case class SearchModelsResponse(models: Seq[ModelDTO],
                currency: Option[CurrencyType],
                regionId: Option[Long],
                pager: Option[FlippingPagerDTO]
                )

object SearchModelsResponse {
    /**
     * Creates the codec for converting SearchModelsResponse from and to JSON.
     */
    implicit val decoder: Decoder[SearchModelsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[SearchModelsResponse] = deriveEncoder
}
