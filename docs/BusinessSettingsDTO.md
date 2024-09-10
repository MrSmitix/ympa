# BusinessSettingsDTO

Настройки кабинета.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**only_default_price** | **bool** | Можно ли установить только [базовую цену](*rule): * &#x60;false&#x60; — можно задать и базовую цену, и цены в конкретных магазинах. * &#x60;true&#x60; — можно задать только базовую цену.  | [optional] 
**currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.business_settings_dto import BusinessSettingsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessSettingsDTO from a JSON string
business_settings_dto_instance = BusinessSettingsDTO.from_json(json)
# print the JSON string representation of the object
print(BusinessSettingsDTO.to_json())

# convert the object into a dict
business_settings_dto_dict = business_settings_dto_instance.to_dict()
# create an instance of BusinessSettingsDTO from a dict
business_settings_dto_from_dict = BusinessSettingsDTO.from_dict(business_settings_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


