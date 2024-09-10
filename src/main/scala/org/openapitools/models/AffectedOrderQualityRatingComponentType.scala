package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов. 
 */
case class AffectedOrderQualityRatingComponentType()

object AffectedOrderQualityRatingComponentType {
    /**
     * Creates the codec for converting AffectedOrderQualityRatingComponentType from and to JSON.
     */
    implicit val decoder: Decoder[AffectedOrderQualityRatingComponentType] = deriveDecoder
    implicit val encoder: ObjectEncoder[AffectedOrderQualityRatingComponentType] = deriveEncoder
}
