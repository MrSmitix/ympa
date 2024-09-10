# ScrollingPagerDTO

Информация о страницах результатов.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_page_token** | **str** | Идентификатор следующей страницы результатов. | [optional] 
**prev_page_token** | **str** | Идентификатор предыдущей страницы результатов. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.scrolling_pager_dto import ScrollingPagerDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ScrollingPagerDTO from a JSON string
scrolling_pager_dto_instance = ScrollingPagerDTO.from_json(json)
# print the JSON string representation of the object
print ScrollingPagerDTO.to_json()

# convert the object into a dict
scrolling_pager_dto_dict = scrolling_pager_dto_instance.to_dict()
# create an instance of ScrollingPagerDTO from a dict
scrolling_pager_dto_from_dict = ScrollingPagerDTO.from_dict(scrolling_pager_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


