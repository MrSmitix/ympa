package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Товары, которые не удалось восстановить из архива.
 * @param notUnarchivedOfferIds Список товаров, которые не удалось восстановить из архива.
 */
case class DeleteOffersFromArchiveDTO(notUnarchivedOfferIds: Option[Seq[String]]
                )

object DeleteOffersFromArchiveDTO {
    /**
     * Creates the codec for converting DeleteOffersFromArchiveDTO from and to JSON.
     */
    implicit val decoder: Decoder[DeleteOffersFromArchiveDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteOffersFromArchiveDTO] = deriveEncoder
}
