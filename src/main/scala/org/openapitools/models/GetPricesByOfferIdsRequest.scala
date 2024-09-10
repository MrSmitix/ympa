package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Запрос списка цен.
 * @param offerIds Список SKU.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
 */
case class GetPricesByOfferIdsRequest(offerIds: Option[Seq[String]]
                )

object GetPricesByOfferIdsRequest {
    /**
     * Creates the codec for converting GetPricesByOfferIdsRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetPricesByOfferIdsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetPricesByOfferIdsRequest] = deriveEncoder
}
