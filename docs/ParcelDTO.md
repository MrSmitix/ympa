# ParcelDTO

Информация о грузовых местах в заказе.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**boxes** | [**List[ParcelBoxDTO]**](ParcelBoxDTO.md) | Список грузовых мест. Маркет определяет количество мест по длине этого списка. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.parcel_dto import ParcelDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ParcelDTO from a JSON string
parcel_dto_instance = ParcelDTO.from_json(json)
# print the JSON string representation of the object
print ParcelDTO.to_json()

# convert the object into a dict
parcel_dto_dict = parcel_dto_instance.to_dict()
# create an instance of ParcelDTO from a dict
parcel_dto_from_dict = ParcelDTO.from_dict(parcel_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


