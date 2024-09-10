package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Модель, по которой работает магазин:  * `FBS` — FBS или Экспресс. * `FBY` — FBY. * `DBS` — DBS. 
 */
case class PlacementType()

object PlacementType {
    /**
     * Creates the codec for converting PlacementType from and to JSON.
     */
    implicit val decoder: Decoder[PlacementType] = deriveDecoder
    implicit val encoder: ObjectEncoder[PlacementType] = deriveEncoder
}
