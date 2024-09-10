package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Состояние точки продаж.  Возможные значения:  * `HIDDEN` — точка продаж выключена. * `VISIBLE` — точка продаж включена. 
 */
case class OutletVisibilityType()

object OutletVisibilityType {
    /**
     * Creates the codec for converting OutletVisibilityType from and to JSON.
     */
    implicit val decoder: Decoder[OutletVisibilityType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OutletVisibilityType] = deriveEncoder
}
