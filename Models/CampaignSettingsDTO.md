# CampaignSettingsDTO
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **countryRegion** | **Long** | Идентификатор региона, в котором находится магазин. | [optional] [default to null] |
| **shopName** | **String** | Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — &#x60;null&#x60;.  | [optional] [default to null] |
| **showInContext** | **Boolean** | Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * &#x60;false&#x60; — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * &#x60;true&#x60; — магазин размещен на сайтах партнеров Яндекс Дистрибуции.  | [optional] [default to null] |
| **showInPremium** | **Boolean** | Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * &#x60;false&#x60; — предложения не показываются в блоке cпецразмещения. * &#x60;true&#x60; — предложения показываются в блоке cпецразмещения.  | [optional] [default to null] |
| **useOpenStat** | **Boolean** | Признак использования внешней интернет-статистики. Возможные значения: * &#x60;false&#x60; — внешняя интернет-статистика не используется. * &#x60;true&#x60; — внешняя интернет-статистика используется.  | [optional] [default to null] |
| **localRegion** | [**CampaignSettingsLocalRegionDTO**](CampaignSettingsLocalRegionDTO.md) |  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

