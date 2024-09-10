# ModelsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Models** | [**ModelDTO[]**](ModelDTO.md) | Список моделей товаров. | 

## Examples

- Prepare the resource
```powershell
$ModelsDTO = Initialize-ympa_powershell_clientModelsDTO  -Models null
```

- Convert the resource to JSON
```powershell
$ModelsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

