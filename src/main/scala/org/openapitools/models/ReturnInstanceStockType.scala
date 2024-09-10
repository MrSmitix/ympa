package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип остатка на складе.
 */
case class ReturnInstanceStockType()

object ReturnInstanceStockType {
    /**
     * Creates the codec for converting ReturnInstanceStockType from and to JSON.
     */
    implicit val decoder: Decoder[ReturnInstanceStockType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ReturnInstanceStockType] = deriveEncoder
}
