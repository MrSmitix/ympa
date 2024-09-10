# PickupAddressDTO

Адрес доставки.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **str** | Страна. | [optional] 
**city** | **str** | Город. | [optional] 
**street** | **str** | Улица. | [optional] 
**house** | **str** | Номер дома. | [optional] 
**postcode** | **str** | Почтовый индекс. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.pickup_address_dto import PickupAddressDTO

# TODO update the JSON string below
json = "{}"
# create an instance of PickupAddressDTO from a JSON string
pickup_address_dto_instance = PickupAddressDTO.from_json(json)
# print the JSON string representation of the object
print PickupAddressDTO.to_json()

# convert the object into a dict
pickup_address_dto_dict = pickup_address_dto_instance.to_dict()
# create an instance of PickupAddressDTO from a dict
pickup_address_dto_from_dict = PickupAddressDTO.from_dict(pickup_address_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


