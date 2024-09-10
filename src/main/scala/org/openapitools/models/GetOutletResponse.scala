package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FullOutletDTO

/**
 * Ответ на запрос информации о точке продаж.
 * @param outlet 
 */
case class GetOutletResponse(outlet: Option[FullOutletDTO]
                )

object GetOutletResponse {
    /**
     * Creates the codec for converting GetOutletResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetOutletResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetOutletResponse] = deriveEncoder
}
