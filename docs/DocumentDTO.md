# DocumentDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**OrderDocumentStatusType**](OrderDocumentStatusType.md) |  | [optional] 
**Number** | **String** | Номер документа. | [optional] 
**Date** | **System.DateTime** | Дата создания документа. | [optional] 

## Examples

- Prepare the resource
```powershell
$DocumentDTO = Initialize-ympa_powershell_clientDocumentDTO  -Status null `
 -Number null `
 -Date null
```

- Convert the resource to JSON
```powershell
$DocumentDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

