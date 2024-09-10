package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Описание ошибки:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU. 
 */
case class RejectedPromoOfferDeleteReasonType()

object RejectedPromoOfferDeleteReasonType {
    /**
     * Creates the codec for converting RejectedPromoOfferDeleteReasonType from and to JSON.
     */
    implicit val decoder: Decoder[RejectedPromoOfferDeleteReasonType] = deriveDecoder
    implicit val encoder: ObjectEncoder[RejectedPromoOfferDeleteReasonType] = deriveEncoder
}
