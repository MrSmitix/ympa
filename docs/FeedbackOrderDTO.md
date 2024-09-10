# FeedbackOrderDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ShopOrderId** | **String** | Номер заказа, указанный в отзыве. | [optional] 
**Delivery** | [**FeedbackDeliveryType**](FeedbackDeliveryType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$FeedbackOrderDTO = Initialize-ympa_powershell_clientFeedbackOrderDTO  -ShopOrderId null `
 -Delivery null
```

- Convert the resource to JSON
```powershell
$FeedbackOrderDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

