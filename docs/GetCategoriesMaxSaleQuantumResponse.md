# GetCategoriesMaxSaleQuantumResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Results** | [**MaxSaleQuantumDTO[]**](MaxSaleQuantumDTO.md) | Категории и лимит на установку кванта и минимального количества товаров. | 
**Errors** | [**CategoryErrorDTO[]**](CategoryErrorDTO.md) | Ошибки, которые появились из-за переданных категорий. | [optional] 

## Examples

- Prepare the resource
```powershell
$GetCategoriesMaxSaleQuantumResponse = Initialize-ympa_powershell_clientGetCategoriesMaxSaleQuantumResponse  -Status null `
 -Results null `
 -Errors null
```

- Convert the resource to JSON
```powershell
$GetCategoriesMaxSaleQuantumResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

