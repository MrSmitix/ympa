# OrderTrackDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TrackCode** | **String** | Трек‑номер посылки. | [optional] 
**DeliveryServiceId** | **Int64** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderTrackDTO = Initialize-ympa_powershell_clientOrderTrackDTO  -TrackCode null `
 -DeliveryServiceId null
```

- Convert the resource to JSON
```powershell
$OrderTrackDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

