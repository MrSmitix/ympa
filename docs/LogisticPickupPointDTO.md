# LogisticPickupPointDTO

Описание пункта вывоза для возврата.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор пункта вывоза. | [optional] 
**name** | **str** | Название пункта вывоза. | [optional] 
**address** | [**PickupAddressDTO**](PickupAddressDTO.md) |  | [optional] 
**instruction** | **str** | Дополнительные инструкции к вывозу. | [optional] 
**type** | [**LogisticPointType**](LogisticPointType.md) |  | [optional] 
**logistic_partner_id** | **int** | Идентификатор логистического партнера, к которому относится логистическая точка. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.logistic_pickup_point_dto import LogisticPickupPointDTO

# TODO update the JSON string below
json = "{}"
# create an instance of LogisticPickupPointDTO from a JSON string
logistic_pickup_point_dto_instance = LogisticPickupPointDTO.from_json(json)
# print the JSON string representation of the object
print LogisticPickupPointDTO.to_json()

# convert the object into a dict
logistic_pickup_point_dto_dict = logistic_pickup_point_dto_instance.to_dict()
# create an instance of LogisticPickupPointDTO from a dict
logistic_pickup_point_dto_from_dict = LogisticPickupPointDTO.from_dict(logistic_pickup_point_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


