# CampaignSettingsDTO

Настройки магазина.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country_region** | **int** | Идентификатор региона, в котором находится магазин. | [optional] 
**shop_name** | **str** | Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — &#x60;null&#x60;.  | [optional] 
**show_in_context** | **bool** | Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * &#x60;false&#x60; — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * &#x60;true&#x60; — магазин размещен на сайтах партнеров Яндекс Дистрибуции.  | [optional] 
**show_in_premium** | **bool** | Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * &#x60;false&#x60; — предложения не показываются в блоке cпецразмещения. * &#x60;true&#x60; — предложения показываются в блоке cпецразмещения.  | [optional] 
**use_open_stat** | **bool** | Признак использования внешней интернет-статистики. Возможные значения: * &#x60;false&#x60; — внешняя интернет-статистика не используется. * &#x60;true&#x60; — внешняя интернет-статистика используется.  | [optional] 
**local_region** | [**CampaignSettingsLocalRegionDTO**](CampaignSettingsLocalRegionDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.campaign_settings_dto import CampaignSettingsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignSettingsDTO from a JSON string
campaign_settings_dto_instance = CampaignSettingsDTO.from_json(json)
# print the JSON string representation of the object
print CampaignSettingsDTO.to_json()

# convert the object into a dict
campaign_settings_dto_dict = campaign_settings_dto_instance.to_dict()
# create an instance of CampaignSettingsDTO from a dict
campaign_settings_dto_from_dict = CampaignSettingsDTO.from_dict(campaign_settings_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


