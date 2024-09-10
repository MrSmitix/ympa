# DocumentDTO

Информация о документе.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**OrderDocumentStatusType**](OrderDocumentStatusType.md) |  | [optional] 
**number** | **str** | Номер документа. | [optional] 
**var_date** | **date** | Дата создания документа. | [optional] 

## Example

```python
from ympa_python_client.models.document_dto import DocumentDTO

# TODO update the JSON string below
json = "{}"
# create an instance of DocumentDTO from a JSON string
document_dto_instance = DocumentDTO.from_json(json)
# print the JSON string representation of the object
print(DocumentDTO.to_json())

# convert the object into a dict
document_dto_dict = document_dto_instance.to_dict()
# create an instance of DocumentDTO from a dict
document_dto_from_dict = DocumentDTO.from_dict(document_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


