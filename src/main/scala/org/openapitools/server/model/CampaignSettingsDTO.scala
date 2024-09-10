package org.openapitools.server.model


/**
 * Настройки магазина.
 *
 * @param countryRegion Идентификатор региона, в котором находится магазин. for example: ''null''
 * @param shopName Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`.  for example: ''null''
 * @param showInContext Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции.  for example: ''null''
 * @param showInPremium Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения.  for example: ''null''
 * @param useOpenStat Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется.  for example: ''null''
 * @param localRegion  for example: ''null''
*/
final case class CampaignSettingsDTO (
  countryRegion: Option[Long] = None,
  shopName: Option[String] = None,
  showInContext: Option[Boolean] = None,
  showInPremium: Option[Boolean] = None,
  useOpenStat: Option[Boolean] = None,
  localRegion: Option[CampaignSettingsLocalRegionDTO] = None
)

