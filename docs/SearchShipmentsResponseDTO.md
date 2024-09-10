# SearchShipmentsResponseDTO

Информация об отгрузках.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shipments** | [**List[ShipmentInfoDTO]**](ShipmentInfoDTO.md) | Список с информацией об отгрузках. | 
**paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.search_shipments_response_dto import SearchShipmentsResponseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of SearchShipmentsResponseDTO from a JSON string
search_shipments_response_dto_instance = SearchShipmentsResponseDTO.from_json(json)
# print the JSON string representation of the object
print(SearchShipmentsResponseDTO.to_json())

# convert the object into a dict
search_shipments_response_dto_dict = search_shipments_response_dto_instance.to_dict()
# create an instance of SearchShipmentsResponseDTO from a dict
search_shipments_response_dto_from_dict = SearchShipmentsResponseDTO.from_dict(search_shipments_response_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


