# RegionalModelInfoDTO

Региональная информация.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] 
**region_id** | **int** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  | [optional] 

## Example

```python
from ympa_python_client.models.regional_model_info_dto import RegionalModelInfoDTO

# TODO update the JSON string below
json = "{}"
# create an instance of RegionalModelInfoDTO from a JSON string
regional_model_info_dto_instance = RegionalModelInfoDTO.from_json(json)
# print the JSON string representation of the object
print(RegionalModelInfoDTO.to_json())

# convert the object into a dict
regional_model_info_dto_dict = regional_model_info_dto_instance.to_dict()
# create an instance of RegionalModelInfoDTO from a dict
regional_model_info_dto_from_dict = RegionalModelInfoDTO.from_dict(regional_model_info_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


