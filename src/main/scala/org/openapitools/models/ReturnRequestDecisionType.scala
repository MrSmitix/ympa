package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Решение по возврату.
 */
case class ReturnRequestDecisionType()

object ReturnRequestDecisionType {
    /**
     * Creates the codec for converting ReturnRequestDecisionType from and to JSON.
     */
    implicit val decoder: Decoder[ReturnRequestDecisionType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ReturnRequestDecisionType] = deriveEncoder
}
