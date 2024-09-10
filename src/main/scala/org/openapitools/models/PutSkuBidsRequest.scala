package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.SkuBidItemDTO
import scala.collection.immutable.Seq

/**
 * description.
 * @param bids Список товаров и ставки для продвижения, которые на них нужно установить.
 */
case class PutSkuBidsRequest(bids: Seq[SkuBidItemDTO]
                )

object PutSkuBidsRequest {
    /**
     * Creates the codec for converting PutSkuBidsRequest from and to JSON.
     */
    implicit val decoder: Decoder[PutSkuBidsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[PutSkuBidsRequest] = deriveEncoder
}
