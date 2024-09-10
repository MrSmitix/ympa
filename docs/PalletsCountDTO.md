# PalletsCountDTO

Количество палет в отгрузке.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**planned** | **int** | Количество палет, которое заявил продавец. | [optional] 
**fact** | **int** | Количество палет, которое приняли в сортировочном центре. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.pallets_count_dto import PalletsCountDTO

# TODO update the JSON string below
json = "{}"
# create an instance of PalletsCountDTO from a JSON string
pallets_count_dto_instance = PalletsCountDTO.from_json(json)
# print the JSON string representation of the object
print PalletsCountDTO.to_json()

# convert the object into a dict
pallets_count_dto_dict = pallets_count_dto_instance.to_dict()
# create an instance of PalletsCountDTO from a dict
pallets_count_dto_from_dict = PalletsCountDTO.from_dict(pallets_count_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


