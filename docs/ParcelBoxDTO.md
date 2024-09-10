# ParcelBoxDTO

Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  | [optional] 
**fulfilment_id** | **str** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.parcel_box_dto import ParcelBoxDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ParcelBoxDTO from a JSON string
parcel_box_dto_instance = ParcelBoxDTO.from_json(json)
# print the JSON string representation of the object
print ParcelBoxDTO.to_json()

# convert the object into a dict
parcel_box_dto_dict = parcel_box_dto_instance.to_dict()
# create an instance of ParcelBoxDTO from a dict
parcel_box_dto_from_dict = ParcelBoxDTO.from_dict(parcel_box_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


