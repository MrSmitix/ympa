package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип логистической точки:    * `WAREHOUSE` — склад.   * `PICKUP_POINT` — обычная точка выдачи заказов (ПВЗ).   * `PICKUP_TERMINAL` — постамат.   * `PICKUP_POST_OFFICE` — отделение почтовой связи (ОПС).   * `PICKUP_MIXED` — торговый зал и пункт выдачи заказов.   * `PICKUP_RETAIL` — торговый зал. 
 */
case class LogisticPointType()

object LogisticPointType {
    /**
     * Creates the codec for converting LogisticPointType from and to JSON.
     */
    implicit val decoder: Decoder[LogisticPointType] = deriveDecoder
    implicit val encoder: ObjectEncoder[LogisticPointType] = deriveEncoder
}
