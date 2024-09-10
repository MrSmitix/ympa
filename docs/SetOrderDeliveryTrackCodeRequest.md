# SetOrderDeliveryTrackCodeRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TrackCode** | **String** | Трек‑номер посылки. | 
**DeliveryServiceId** | **Int64** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | 

## Examples

- Prepare the resource
```powershell
$SetOrderDeliveryTrackCodeRequest = Initialize-ympa_powershell_clientSetOrderDeliveryTrackCodeRequest  -TrackCode null `
 -DeliveryServiceId null
```

- Convert the resource to JSON
```powershell
$SetOrderDeliveryTrackCodeRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

