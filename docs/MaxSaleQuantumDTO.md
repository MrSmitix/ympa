# MaxSaleQuantumDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор категории. | 
**Name** | **String** | Название категории. | [optional] 
**MaxSaleQuantum** | **Int32** | Лимит на установку кванта и минимального количества товаров. | [optional] 

## Examples

- Prepare the resource
```powershell
$MaxSaleQuantumDTO = Initialize-ympa_powershell_clientMaxSaleQuantumDTO  -Id null `
 -Name null `
 -MaxSaleQuantum null
```

- Convert the resource to JSON
```powershell
$MaxSaleQuantumDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

