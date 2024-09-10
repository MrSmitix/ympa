
# Table `CampaignSettingsDTO`
(mapped from: CampaignSettingsDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**countryRegion** | countryRegion | long |  | **kotlin.Long** | Идентификатор региона, в котором находится магазин. |  [optional]
**shopName** | shopName | text |  | **kotlin.String** | Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — &#x60;null&#x60;.  |  [optional]
**showInContext** | showInContext | boolean |  | **kotlin.Boolean** | Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * &#x60;false&#x60; — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * &#x60;true&#x60; — магазин размещен на сайтах партнеров Яндекс Дистрибуции.  |  [optional]
**showInPremium** | showInPremium | boolean |  | **kotlin.Boolean** | Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * &#x60;false&#x60; — предложения не показываются в блоке cпецразмещения. * &#x60;true&#x60; — предложения показываются в блоке cпецразмещения.  |  [optional]
**useOpenStat** | useOpenStat | boolean |  | **kotlin.Boolean** | Признак использования внешней интернет-статистики. Возможные значения: * &#x60;false&#x60; — внешняя интернет-статистика не используется. * &#x60;true&#x60; — внешняя интернет-статистика используется.  |  [optional]
**localRegion** | localRegion | long |  | [**CampaignSettingsLocalRegionDTO**](CampaignSettingsLocalRegionDTO.md) |  |  [optional] [foreignkey]








