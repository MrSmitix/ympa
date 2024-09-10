package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
 * @param fromDate Формат даты: `ДД-ММ-ГГГГ`. 
 * @param toDate Формат даты: `ДД-ММ-ГГГГ`. 
 */
case class CampaignSettingsTimePeriodDTO(fromDate: Option[String],
                toDate: Option[String]
                )

object CampaignSettingsTimePeriodDTO {
    /**
     * Creates the codec for converting CampaignSettingsTimePeriodDTO from and to JSON.
     */
    implicit val decoder: Decoder[CampaignSettingsTimePeriodDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignSettingsTimePeriodDTO] = deriveEncoder
}
