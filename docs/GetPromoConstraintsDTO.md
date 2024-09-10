# GetPromoConstraintsDTO

Ограничения в акции.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**warehouse_ids** | **List[int]** | Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу.  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_promo_constraints_dto import GetPromoConstraintsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetPromoConstraintsDTO from a JSON string
get_promo_constraints_dto_instance = GetPromoConstraintsDTO.from_json(json)
# print the JSON string representation of the object
print GetPromoConstraintsDTO.to_json()

# convert the object into a dict
get_promo_constraints_dto_dict = get_promo_constraints_dto_instance.to_dict()
# create an instance of GetPromoConstraintsDTO from a dict
get_promo_constraints_dto_from_dict = GetPromoConstraintsDTO.from_dict(get_promo_constraints_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


