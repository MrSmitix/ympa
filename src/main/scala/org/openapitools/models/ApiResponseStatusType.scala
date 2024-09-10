package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип ответа.
 */
case class ApiResponseStatusType()

object ApiResponseStatusType {
    /**
     * Creates the codec for converting ApiResponseStatusType from and to JSON.
     */
    implicit val decoder: Decoder[ApiResponseStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ApiResponseStatusType] = deriveEncoder
}
