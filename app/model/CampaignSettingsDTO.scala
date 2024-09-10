package model

import play.api.libs.json._

/**
  * Настройки магазина.
  * @param countryRegion Идентификатор региона, в котором находится магазин.
  * @param shopName Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. 
  * @param showInContext Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
  * @param showInPremium Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. 
  * @param useOpenStat Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CampaignSettingsDTO(
  countryRegion: Option[Long],
  shopName: Option[String],
  showInContext: Option[Boolean],
  showInPremium: Option[Boolean],
  useOpenStat: Option[Boolean],
  localRegion: Option[CampaignSettingsLocalRegionDTO]
)

object CampaignSettingsDTO {
  implicit lazy val campaignSettingsDTOJsonFormat: Format[CampaignSettingsDTO] = Json.format[CampaignSettingsDTO]
}

