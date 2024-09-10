package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferContentDTO
import scala.collection.immutable.Seq

/**
 * Запрос на установку новых значений для параметров.
 * @param offersContent Список товаров с указанными характеристиками.
 */
case class UpdateOfferContentRequest(offersContent: Seq[OfferContentDTO]
                )

object UpdateOfferContentRequest {
    /**
     * Creates the codec for converting UpdateOfferContentRequest from and to JSON.
     */
    implicit val decoder: Decoder[UpdateOfferContentRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateOfferContentRequest] = deriveEncoder
}
