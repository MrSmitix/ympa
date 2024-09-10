# GetBidsInfoResponseDTO

Список товаров с указанными ставками.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bids** | [**List[SkuBidItemDTO]**](SkuBidItemDTO.md) | Страница списка товаров. | 
**paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_bids_info_response_dto import GetBidsInfoResponseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetBidsInfoResponseDTO from a JSON string
get_bids_info_response_dto_instance = GetBidsInfoResponseDTO.from_json(json)
# print the JSON string representation of the object
print GetBidsInfoResponseDTO.to_json()

# convert the object into a dict
get_bids_info_response_dto_dict = get_bids_info_response_dto_instance.to_dict()
# create an instance of GetBidsInfoResponseDTO from a dict
get_bids_info_response_dto_from_dict = GetBidsInfoResponseDTO.from_dict(get_bids_info_response_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


