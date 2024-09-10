package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Товары, которые нужно восстановить из архива. 
 * @param offerIds Список товаров, которые нужно восстановить из архива.
 */
case class DeleteOffersFromArchiveRequest(offerIds: Seq[String]
                )

object DeleteOffersFromArchiveRequest {
    /**
     * Creates the codec for converting DeleteOffersFromArchiveRequest from and to JSON.
     */
    implicit val decoder: Decoder[DeleteOffersFromArchiveRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteOffersFromArchiveRequest] = deriveEncoder
}
