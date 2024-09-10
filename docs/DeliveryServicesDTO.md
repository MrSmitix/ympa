# DeliveryServicesDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DeliveryService** | [**DeliveryServiceInfoDTO[]**](DeliveryServiceInfoDTO.md) | Информация о службе доставки. | 

## Examples

- Prepare the resource
```powershell
$DeliveryServicesDTO = Initialize-ympa_powershell_clientDeliveryServicesDTO  -DeliveryService null
```

- Convert the resource to JSON
```powershell
$DeliveryServicesDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

