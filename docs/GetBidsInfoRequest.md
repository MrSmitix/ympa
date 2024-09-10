# GetBidsInfoRequest

description.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**skus** | **List[str]** | Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры &#x60;page_token&#x60; и &#x60;limit&#x60; игнорируются.  | [optional] 

## Example

```python
from ympa_python_client.models.get_bids_info_request import GetBidsInfoRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetBidsInfoRequest from a JSON string
get_bids_info_request_instance = GetBidsInfoRequest.from_json(json)
# print the JSON string representation of the object
print(GetBidsInfoRequest.to_json())

# convert the object into a dict
get_bids_info_request_dict = get_bids_info_request_instance.to_dict()
# create an instance of GetBidsInfoRequest from a dict
get_bids_info_request_from_dict = GetBidsInfoRequest.from_dict(get_bids_info_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


