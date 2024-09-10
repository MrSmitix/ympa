package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.
 * @param notDeletedOfferIds Список SKU товаров, которые не удалось удалить.
 */
case class DeleteOffersDTO(notDeletedOfferIds: Option[Seq[String]]
                )

object DeleteOffersDTO {
    /**
     * Creates the codec for converting DeleteOffersDTO from and to JSON.
     */
    implicit val decoder: Decoder[DeleteOffersDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteOffersDTO] = deriveEncoder
}
