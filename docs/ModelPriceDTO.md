# ModelPriceDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Avg** | **Decimal** | Средняя цена предложения для модели в регионе. | [optional] 
**Max** | **Decimal** | Максимальная цена предложения для модели в регионе. | [optional] 
**Min** | **Decimal** | Минимальная цена предложения для модели в регионе. | [optional] 

## Examples

- Prepare the resource
```powershell
$ModelPriceDTO = Initialize-ympa_powershell_clientModelPriceDTO  -Avg null `
 -Max null `
 -Min null
```

- Convert the resource to JSON
```powershell
$ModelPriceDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

