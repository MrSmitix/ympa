# GetFeedsResponse

Ответ на запрос списка прайс-листов.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feeds** | [**List[FeedDTO]**](FeedDTO.md) | Список прайс-листов. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_feeds_response import GetFeedsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetFeedsResponse from a JSON string
get_feeds_response_instance = GetFeedsResponse.from_json(json)
# print the JSON string representation of the object
print GetFeedsResponse.to_json()

# convert the object into a dict
get_feeds_response_dict = get_feeds_response_instance.to_dict()
# create an instance of GetFeedsResponse from a dict
get_feeds_response_from_dict = GetFeedsResponse.from_dict(get_feeds_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


