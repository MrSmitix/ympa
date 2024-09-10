package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Фильтрации удаляемых товаров по offerIds. 
 * @param offerIds Список SKU товаров, которые нужно удалить.
 */
case class DeleteOffersRequest(offerIds: Seq[String]
                )

object DeleteOffersRequest {
    /**
     * Creates the codec for converting DeleteOffersRequest from and to JSON.
     */
    implicit val decoder: Decoder[DeleteOffersRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteOffersRequest] = deriveEncoder
}
