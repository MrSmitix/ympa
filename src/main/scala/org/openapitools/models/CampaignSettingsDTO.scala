package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CampaignSettingsLocalRegionDTO

/**
 * Настройки магазина.
 * @param countryRegion Идентификатор региона, в котором находится магазин.
 * @param shopName Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. 
 * @param showInContext Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
 * @param showInPremium Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. 
 * @param useOpenStat Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. 
 * @param localRegion 
 */
case class CampaignSettingsDTO(countryRegion: Option[Long],
                shopName: Option[String],
                showInContext: Option[Boolean],
                showInPremium: Option[Boolean],
                useOpenStat: Option[Boolean],
                localRegion: Option[CampaignSettingsLocalRegionDTO]
                )

object CampaignSettingsDTO {
    /**
     * Creates the codec for converting CampaignSettingsDTO from and to JSON.
     */
    implicit val decoder: Decoder[CampaignSettingsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignSettingsDTO] = deriveEncoder
}
