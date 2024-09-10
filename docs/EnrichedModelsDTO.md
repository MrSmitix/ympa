# EnrichedModelsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Models** | [**EnrichedModelDTO[]**](EnrichedModelDTO.md) | Список моделей товаров. | 

## Examples

- Prepare the resource
```powershell
$EnrichedModelsDTO = Initialize-ympa_powershell_clientEnrichedModelsDTO  -Models null
```

- Convert the resource to JSON
```powershell
$EnrichedModelsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

