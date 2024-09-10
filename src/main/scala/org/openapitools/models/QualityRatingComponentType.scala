package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов.  **Для модели FBY:** * `FBY_LATE_DELIVERY_RATE` — доля товаров, которые приехали на склад с опозданием. * `FBY_CANCELLATION_RATE` — доля отмененных или недоставленных товаров. * `FBY_DELIVERY_DIFF_RATE` — доля товаров, которые не прибыли вместе с поставкой или которые не приняли. * `FBY_LATE_EDITING_RATE` — доля товаров, которые поздно убрали из заявки. 
 */
case class QualityRatingComponentType()

object QualityRatingComponentType {
    /**
     * Creates the codec for converting QualityRatingComponentType from and to JSON.
     */
    implicit val decoder: Decoder[QualityRatingComponentType] = deriveDecoder
    implicit val encoder: ObjectEncoder[QualityRatingComponentType] = deriveEncoder
}
