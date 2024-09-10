# OrderBuyerDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Идентификатор покупателя. | [optional] 
**LastName** | **String** | Фамилия покупателя. | [optional] 
**FirstName** | **String** | Имя покупателя. | [optional] 
**MiddleName** | **String** | Отчество покупателя. | [optional] 
**Type** | [**OrderBuyerType**](OrderBuyerType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderBuyerDTO = Initialize-ympa_powershell_clientOrderBuyerDTO  -Id null `
 -LastName null `
 -FirstName null `
 -MiddleName null `
 -Type null
```

- Convert the resource to JSON
```powershell
$OrderBuyerDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

