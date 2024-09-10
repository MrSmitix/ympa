package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Причина, по которой товар не удалось поместить в архив:  * `OFFER_HAS_STOCKS` — товар хранится на складе Маркета. 
 */
case class AddOffersToArchiveErrorType()

object AddOffersToArchiveErrorType {
    /**
     * Creates the codec for converting AddOffersToArchiveErrorType from and to JSON.
     */
    implicit val decoder: Decoder[AddOffersToArchiveErrorType] = deriveDecoder
    implicit val encoder: ObjectEncoder[AddOffersToArchiveErrorType] = deriveEncoder
}
