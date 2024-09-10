package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Логистический статус конкретного товара.
 */
case class ReturnInstanceStatusType()

object ReturnInstanceStatusType {
    /**
     * Creates the codec for converting ReturnInstanceStatusType from and to JSON.
     */
    implicit val decoder: Decoder[ReturnInstanceStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ReturnInstanceStatusType] = deriveEncoder
}
