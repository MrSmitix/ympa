package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.MechanicsType
import org.openapitools.models.PromoParticipationType

/**
 * Фильтры для получения списка акций.
 * @param participation 
 * @param mechanics 
 */
case class GetPromosRequest(participation: Option[PromoParticipationType],
                mechanics: Option[MechanicsType]
                )

object GetPromosRequest {
    /**
     * Creates the codec for converting GetPromosRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetPromosRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetPromosRequest] = deriveEncoder
}
