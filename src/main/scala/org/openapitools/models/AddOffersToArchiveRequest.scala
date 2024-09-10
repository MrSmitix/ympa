package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Товары, которые нужно поместить в архив. 
 * @param offerIds Список товаров, которые нужно поместить в архив.
 */
case class AddOffersToArchiveRequest(offerIds: Seq[String]
                )

object AddOffersToArchiveRequest {
    /**
     * Creates the codec for converting AddOffersToArchiveRequest from and to JSON.
     */
    implicit val decoder: Decoder[AddOffersToArchiveRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AddOffersToArchiveRequest] = deriveEncoder
}
