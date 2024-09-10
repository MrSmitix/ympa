# OrderBusinessDocumentsDTO

Информация о документах. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**upd** | [**DocumentDTO**](DocumentDTO.md) |  | [optional] 
**ukd** | [**DocumentDTO**](DocumentDTO.md) |  | [optional] 
**torg_twelve** | [**DocumentDTO**](DocumentDTO.md) |  | [optional] 
**sf** | [**DocumentDTO**](DocumentDTO.md) |  | [optional] 
**ksf** | [**DocumentDTO**](DocumentDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.order_business_documents_dto import OrderBusinessDocumentsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderBusinessDocumentsDTO from a JSON string
order_business_documents_dto_instance = OrderBusinessDocumentsDTO.from_json(json)
# print the JSON string representation of the object
print OrderBusinessDocumentsDTO.to_json()

# convert the object into a dict
order_business_documents_dto_dict = order_business_documents_dto_instance.to_dict()
# create an instance of OrderBusinessDocumentsDTO from a dict
order_business_documents_dto_from_dict = OrderBusinessDocumentsDTO.from_dict(order_business_documents_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


