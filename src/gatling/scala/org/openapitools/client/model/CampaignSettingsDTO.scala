
package org.openapitools.client.model


case class CampaignSettingsDTO (
    /* Идентификатор региона, в котором находится магазин. */
    _countryRegion: Option[Long],
    /* Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`.  */
    _shopName: Option[String],
    /* Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции.  */
    _showInContext: Option[Boolean],
    /* Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения.  */
    _showInPremium: Option[Boolean],
    /* Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется.  */
    _useOpenStat: Option[Boolean],
    _localRegion: Option[CampaignSettingsLocalRegionDTO]
)
object CampaignSettingsDTO {
    def toStringBody(var_countryRegion: Object, var_shopName: Object, var_showInContext: Object, var_showInPremium: Object, var_useOpenStat: Object, var_localRegion: Object) =
        s"""
        | {
        | "countryRegion":$var_countryRegion,"shopName":$var_shopName,"showInContext":$var_showInContext,"showInPremium":$var_showInPremium,"useOpenStat":$var_useOpenStat,"localRegion":$var_localRegion
        | }
        """.stripMargin
}
