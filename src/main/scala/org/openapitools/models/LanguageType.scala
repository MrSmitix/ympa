package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Язык:  * `RU` — русский.  * `EN` — английский. 
 */
case class LanguageType()

object LanguageType {
    /**
     * Creates the codec for converting LanguageType from and to JSON.
     */
    implicit val decoder: Decoder[LanguageType] = deriveDecoder
    implicit val encoder: ObjectEncoder[LanguageType] = deriveEncoder
}
