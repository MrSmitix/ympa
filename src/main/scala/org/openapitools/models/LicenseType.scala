package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип лицензии:  * `ALCOHOL` — лицензия на розничную продажу алкогольной продукции. 
 */
case class LicenseType()

object LicenseType {
    /**
     * Creates the codec for converting LicenseType from and to JSON.
     */
    implicit val decoder: Decoder[LicenseType] = deriveDecoder
    implicit val encoder: ObjectEncoder[LicenseType] = deriveEncoder
}
