package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Источник информации о расписании работы службы доставки. Возможные значения: * `WEB` — информация получена из настроек кабинета продавца на Маркете. * `YML` — информация получена из прайс-листа магазина. 
 */
case class CampaignSettingsScheduleSourceType()

object CampaignSettingsScheduleSourceType {
    /**
     * Creates the codec for converting CampaignSettingsScheduleSourceType from and to JSON.
     */
    implicit val decoder: Decoder[CampaignSettingsScheduleSourceType] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignSettingsScheduleSourceType] = deriveEncoder
}
