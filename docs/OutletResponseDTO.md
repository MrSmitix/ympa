# OutletResponseDTO

Результат выполнения запроса. Выводится, если `status=\"OK\"`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор точки продаж, присвоенный Маркетом. | [optional] 

## Example

```python
from ympa_python_client.models.outlet_response_dto import OutletResponseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OutletResponseDTO from a JSON string
outlet_response_dto_instance = OutletResponseDTO.from_json(json)
# print the JSON string representation of the object
print(OutletResponseDTO.to_json())

# convert the object into a dict
outlet_response_dto_dict = outlet_response_dto_instance.to_dict()
# create an instance of OutletResponseDTO from a dict
outlet_response_dto_from_dict = OutletResponseDTO.from_dict(outlet_response_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


