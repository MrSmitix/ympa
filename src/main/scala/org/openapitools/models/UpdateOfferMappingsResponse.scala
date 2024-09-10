package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.UpdateOfferMappingResultDTO
import scala.collection.immutable.Seq

/**
 * Описывает проблемы, возникшие при сохранении товара.
 * @param status 
 * @param results Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
 */
case class UpdateOfferMappingsResponse(status: Option[ApiResponseStatusType],
                results: Option[Seq[UpdateOfferMappingResultDTO]]
                )

object UpdateOfferMappingsResponse {
    /**
     * Creates the codec for converting UpdateOfferMappingsResponse from and to JSON.
     */
    implicit val decoder: Decoder[UpdateOfferMappingsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateOfferMappingsResponse] = deriveEncoder
}
