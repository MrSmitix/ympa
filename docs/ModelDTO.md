# ModelDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор модели товара. | [optional] 
**Name** | **String** | Название модели товара. | [optional] 
**Prices** | [**ModelPriceDTO**](ModelPriceDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ModelDTO = Initialize-ympa_powershell_clientModelDTO  -Id null `
 -Name null `
 -Prices null
```

- Convert the resource to JSON
```powershell
$ModelDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

