package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип точки продаж.  Возможные значения:  * `DEPOT` — пункт выдачи заказов. * `MIXED` — смешанный тип точки продаж (торговый зал и пункт выдачи заказов). * `RETAIL` — розничная точка продаж (торговый зал). 
 */
case class OutletType()

object OutletType {
    /**
     * Creates the codec for converting OutletType from and to JSON.
     */
    implicit val decoder: Decoder[OutletType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OutletType] = deriveEncoder
}
