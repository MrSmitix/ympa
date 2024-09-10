# CampaignSettingsDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country_region** | Option<**i64**> | Идентификатор региона, в котором находится магазин. | [optional]
**shop_name** | Option<**String**> | Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`.  | [optional]
**show_in_context** | Option<**bool**> | Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции.  | [optional]
**show_in_premium** | Option<**bool**> | Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения.  | [optional]
**use_open_stat** | Option<**bool**> | Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется.  | [optional]
**local_region** | Option<[**models::CampaignSettingsLocalRegionDto**](CampaignSettingsLocalRegionDTO.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


