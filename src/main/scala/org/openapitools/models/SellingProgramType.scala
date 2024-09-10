package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Модель размещения:  * `FBY` — FBY. * `FBS` — FBS. * `DBS` — DBS. * `EXPRESS` — Экспресс. 
 */
case class SellingProgramType()

object SellingProgramType {
    /**
     * Creates the codec for converting SellingProgramType from and to JSON.
     */
    implicit val decoder: Decoder[SellingProgramType] = deriveDecoder
    implicit val encoder: ObjectEncoder[SellingProgramType] = deriveEncoder
}
