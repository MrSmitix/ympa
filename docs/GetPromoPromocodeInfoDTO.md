# GetPromoPromocodeInfoDTO

Информация для типа `MARKET_PROMOCODE`.  Параметр заполняется только для этого типа акции. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**promocode** | **str** | Промокод. | 
**discount** | **int** | Процент скидки по промокоду. | 

## Example

```python
from ympa_python_client.models.get_promo_promocode_info_dto import GetPromoPromocodeInfoDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetPromoPromocodeInfoDTO from a JSON string
get_promo_promocode_info_dto_instance = GetPromoPromocodeInfoDTO.from_json(json)
# print the JSON string representation of the object
print(GetPromoPromocodeInfoDTO.to_json())

# convert the object into a dict
get_promo_promocode_info_dto_dict = get_promo_promocode_info_dto_instance.to_dict()
# create an instance of GetPromoPromocodeInfoDTO from a dict
get_promo_promocode_info_dto_from_dict = GetPromoPromocodeInfoDTO.from_dict(get_promo_promocode_info_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


