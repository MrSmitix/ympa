package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Привлекательность цены:  * `OPTIMAL` — привлекательная. * `AVERAGE` — умеренная. * `LOW` — непривлекательная. 
 */
case class PriceCompetitivenessType()

object PriceCompetitivenessType {
    /**
     * Creates the codec for converting PriceCompetitivenessType from and to JSON.
     */
    implicit val decoder: Decoder[PriceCompetitivenessType] = deriveDecoder
    implicit val encoder: ObjectEncoder[PriceCompetitivenessType] = deriveEncoder
}
