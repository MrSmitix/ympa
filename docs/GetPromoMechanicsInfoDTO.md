# GetPromoMechanicsInfoDTO

Информация о типе акции.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**MechanicsType**](MechanicsType.md) |  | 
**promocode_info** | [**GetPromoPromocodeInfoDTO**](GetPromoPromocodeInfoDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_promo_mechanics_info_dto import GetPromoMechanicsInfoDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetPromoMechanicsInfoDTO from a JSON string
get_promo_mechanics_info_dto_instance = GetPromoMechanicsInfoDTO.from_json(json)
# print the JSON string representation of the object
print GetPromoMechanicsInfoDTO.to_json()

# convert the object into a dict
get_promo_mechanics_info_dto_dict = get_promo_mechanics_info_dto_instance.to_dict()
# create an instance of GetPromoMechanicsInfoDTO from a dict
get_promo_mechanics_info_dto_from_dict = GetPromoMechanicsInfoDTO.from_dict(get_promo_mechanics_info_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


