# OrderBuyerBasicInfoDTO
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
$OrderBuyerBasicInfoDTO = Initialize-ympa_powershell_clientOrderBuyerBasicInfoDTO  -Id null `
 -LastName null `
 -FirstName null `
 -MiddleName null `
 -Type null
```

- Convert the resource to JSON
```powershell
$OrderBuyerBasicInfoDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

