package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BusinessDTO
import org.openapitools.models.BusinessSettingsDTO

/**
 * Информация о кабинете и его настройках.
 * @param info 
 * @param settings 
 */
case class GetBusinessSettingsInfoDTO(info: Option[BusinessDTO],
                settings: Option[BusinessSettingsDTO]
                )

object GetBusinessSettingsInfoDTO {
    /**
     * Creates the codec for converting GetBusinessSettingsInfoDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetBusinessSettingsInfoDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetBusinessSettingsInfoDTO] = deriveEncoder
}
