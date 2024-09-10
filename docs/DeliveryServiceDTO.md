# DeliveryServiceDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор службы доставки. | [optional] 
**Name** | **String** | Наименование службы доставки. | [optional] 

## Examples

- Prepare the resource
```powershell
$DeliveryServiceDTO = Initialize-ympa_powershell_clientDeliveryServiceDTO  -Id null `
 -Name null
```

- Convert the resource to JSON
```powershell
$DeliveryServiceDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

