# FeedParameterDTO

Параметр прайс-листа.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleted** | **bool** | Удалить ли значение параметра.  Возможное значение: * &#x60;true&#x60; — удалить значение параметра.  Используется вместе с параметром &#x60;name&#x60;.  | [optional] 
**name** | **str** | Название параметра.  Возможное значение: - &#x60;reparseIntervalMinutes&#x60; — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре &#x60;value&#x60;. Например, при &#x60;value&#x3D;1440&#x60;, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр.  | 
**values** | **List[int]** | Значения параметра.  Используется вместе с параметром &#x60;name&#x60;.  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.feed_parameter_dto import FeedParameterDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedParameterDTO from a JSON string
feed_parameter_dto_instance = FeedParameterDTO.from_json(json)
# print the JSON string representation of the object
print FeedParameterDTO.to_json()

# convert the object into a dict
feed_parameter_dto_dict = feed_parameter_dto_instance.to_dict()
# create an instance of FeedParameterDTO from a dict
feed_parameter_dto_from_dict = FeedParameterDTO.from_dict(feed_parameter_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


