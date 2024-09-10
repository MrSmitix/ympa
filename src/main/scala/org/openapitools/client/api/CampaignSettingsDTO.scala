package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignSettingsDTO._

case class CampaignSettingsDTO (
  /* Идентификатор региона, в котором находится магазин. */
  countryRegion: Option[Long],
/* Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`.  */
  shopName: Option[String],
/* Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции.  */
  showInContext: Option[Boolean],
/* Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения.  */
  showInPremium: Option[Boolean],
/* Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется.  */
  useOpenStat: Option[Boolean],
localRegion: Option[CampaignSettingsLocalRegionDTO])

object CampaignSettingsDTO {
  import DateTimeCodecs._

  implicit val CampaignSettingsDTOCodecJson: CodecJson[CampaignSettingsDTO] = CodecJson.derive[CampaignSettingsDTO]
  implicit val CampaignSettingsDTODecoder: EntityDecoder[CampaignSettingsDTO] = jsonOf[CampaignSettingsDTO]
  implicit val CampaignSettingsDTOEncoder: EntityEncoder[CampaignSettingsDTO] = jsonEncoderOf[CampaignSettingsDTO]
}
