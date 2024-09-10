package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Статус документа:  * `READY` — готов. * `NOT_READY` — не готов. 
 */
case class OrderDocumentStatusType()

object OrderDocumentStatusType {
    /**
     * Creates the codec for converting OrderDocumentStatusType from and to JSON.
     */
    implicit val decoder: Decoder[OrderDocumentStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderDocumentStatusType] = deriveEncoder
}
