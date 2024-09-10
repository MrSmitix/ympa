package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.AddOffersToArchiveErrorDTO
import scala.collection.immutable.Seq

/**
 * Товары, которые не удалось поместить в архив.
 * @param notArchivedOffers Список товаров, которые не удалось поместить в архив.
 */
case class AddOffersToArchiveDTO(notArchivedOffers: Option[Seq[AddOffersToArchiveErrorDTO]]
                )

object AddOffersToArchiveDTO {
    /**
     * Creates the codec for converting AddOffersToArchiveDTO from and to JSON.
     */
    implicit val decoder: Decoder[AddOffersToArchiveDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[AddOffersToArchiveDTO] = deriveEncoder
}
