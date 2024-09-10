package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Статус проверки лицензии:  * `NEW` — лицензия проверяется. * `SUCCESS` — лицензия прошла проверку. * `FAIL` — лицензия не прошла проверку. 
 */
case class LicenseCheckStatusType()

object LicenseCheckStatusType {
    /**
     * Creates the codec for converting LicenseCheckStatusType from and to JSON.
     */
    implicit val decoder: Decoder[LicenseCheckStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[LicenseCheckStatusType] = deriveEncoder
}
