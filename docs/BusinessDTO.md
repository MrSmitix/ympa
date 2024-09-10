# BusinessDTO

Информация о кабинете.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор кабинета. | [optional] 
**name** | **str** | Название бизнеса. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.business_dto import BusinessDTO

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessDTO from a JSON string
business_dto_instance = BusinessDTO.from_json(json)
# print the JSON string representation of the object
print BusinessDTO.to_json()

# convert the object into a dict
business_dto_dict = business_dto_instance.to_dict()
# create an instance of BusinessDTO from a dict
business_dto_from_dict = BusinessDTO.from_dict(business_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


