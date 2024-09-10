package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FeedPublicationFullDTO
import org.openapitools.models.FeedPublicationPriceAndStockUpdateDTO
import org.openapitools.models.FeedStatusType

/**
 * Информация о последней публикации предложений из прайс-листа на Маркете.
 * @param status 
 * @param full 
 * @param priceAndStockUpdate 
 */
case class FeedPublicationDTO(status: Option[FeedStatusType],
                full: Option[FeedPublicationFullDTO],
                priceAndStockUpdate: Option[FeedPublicationPriceAndStockUpdateDTO]
                )

object FeedPublicationDTO {
    /**
     * Creates the codec for converting FeedPublicationDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedPublicationDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedPublicationDTO] = deriveEncoder
}
