package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CurrencyType

/**
 * Региональная информация.
 * @param currency 
 * @param regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
 */
case class RegionalModelInfoDTO(currency: Option[CurrencyType],
                regionId: Option[Long]
                )

object RegionalModelInfoDTO {
    /**
     * Creates the codec for converting RegionalModelInfoDTO from and to JSON.
     */
    implicit val decoder: Decoder[RegionalModelInfoDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[RegionalModelInfoDTO] = deriveEncoder
}
