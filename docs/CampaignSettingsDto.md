# CampaignSettingsDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country_region** | **i64** | Идентификатор региона, в котором находится магазин. | [optional] [default to None]
**shop_name** | **String** | Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`.  | [optional] [default to None]
**show_in_context** | **bool** | Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции.  | [optional] [default to None]
**show_in_premium** | **bool** | Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения.  | [optional] [default to None]
**use_open_stat** | **bool** | Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется.  | [optional] [default to None]
**local_region** | [***models::CampaignSettingsLocalRegionDto**](CampaignSettingsLocalRegionDTO.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


