package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.GetBusinessSettingsInfoDTO

/**
 * Ответ на запрос настроек кабинета.
 * @param status 
 * @param result 
 */
case class GetBusinessSettingsResponse(status: Option[ApiResponseStatusType],
                result: Option[GetBusinessSettingsInfoDTO]
                )

object GetBusinessSettingsResponse {
    /**
     * Creates the codec for converting GetBusinessSettingsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetBusinessSettingsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetBusinessSettingsResponse] = deriveEncoder
}
