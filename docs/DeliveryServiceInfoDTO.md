# DeliveryServiceInfoDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор службы доставки. | 
**Name** | **String** | Наименование службы доставки. | 

## Examples

- Prepare the resource
```powershell
$DeliveryServiceInfoDTO = Initialize-ympa_powershell_clientDeliveryServiceInfoDTO  -Id null `
 -Name null
```

- Convert the resource to JSON
```powershell
$DeliveryServiceInfoDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

