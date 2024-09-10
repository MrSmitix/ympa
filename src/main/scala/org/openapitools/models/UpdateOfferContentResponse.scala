package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.UpdateOfferContentResultDTO
import scala.collection.immutable.Seq

/**
 * Описывает проблемы, которые появились при сохранении товара.
 * @param status 
 * @param results Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
 */
case class UpdateOfferContentResponse(status: Option[ApiResponseStatusType],
                results: Option[Seq[UpdateOfferContentResultDTO]]
                )

object UpdateOfferContentResponse {
    /**
     * Creates the codec for converting UpdateOfferContentResponse from and to JSON.
     */
    implicit val decoder: Decoder[UpdateOfferContentResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateOfferContentResponse] = deriveEncoder
}
