# ForwardScrollingPagerDTO

Ссылка на следующую страницу. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_page_token** | **str** | Идентификатор следующей страницы результатов. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.forward_scrolling_pager_dto import ForwardScrollingPagerDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ForwardScrollingPagerDTO from a JSON string
forward_scrolling_pager_dto_instance = ForwardScrollingPagerDTO.from_json(json)
# print the JSON string representation of the object
print ForwardScrollingPagerDTO.to_json()

# convert the object into a dict
forward_scrolling_pager_dto_dict = forward_scrolling_pager_dto_instance.to_dict()
# create an instance of ForwardScrollingPagerDTO from a dict
forward_scrolling_pager_dto_from_dict = ForwardScrollingPagerDTO.from_dict(forward_scrolling_pager_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


